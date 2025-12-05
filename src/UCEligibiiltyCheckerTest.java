import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class UCEligibiiltyCheckerTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;
    private final InputStream originalSystemIn = System.in;
    private ByteArrayInputStream simulatedInput;

    @BeforeEach
    public void setUp () {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown () {
        System.setOut(originalSystemOut);
        System.setIn(originalSystemIn);
    }

    @Test
    @DisplayName("Eligible for UC admission")
    void testEligible() {
        String input = "3.5\ntrue\n";
        // Create a simulated input stream from the string
        simulatedInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        // Redirect System.in to use the simulated input
        System.setIn(simulatedInput);

        // Call the method that uses the Scanner
        UCEligibiiltyChecker.askAdmissionsQuestions();

        String methodExpected = "\n--- UC Eligibility Results ---\n" +
                "GPA: 3.50\n" +
                "Meets GPA requirement\n" +
                "A-G requirements completed\n" +
                "Final Verdict: Eligible for UC admission\n";
        String overallExpected = "Enter your A-G GPA (unweighted): Have you completed all A-G courses? (true/false): " + methodExpected;

        assertEquals(methodExpected, UCEligibiiltyChecker.checkEligibility(3.5, true));
        assertEquals(overallExpected, outputStreamCaptor.toString());
    }

    @Test
    @DisplayName("Ineligible for UC admission - GPA Low")
    void testIneligibleGPA() {
        String input = "2.1\ntrue\n";
        // Create a simulated input stream from the string
        simulatedInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        // Redirect System.in to use the simulated input
        System.setIn(simulatedInput);

        // Call the method that uses the Scanner
        UCEligibiiltyChecker.askAdmissionsQuestions();

        String methodExpected = "\n--- UC Eligibility Results ---\n" +
                "GPA: 2.10\n" +
                "Does NOT meet GPA requirement\n" +
                "A-G requirements completed\n" +
                "Final Verdict: NOT eligible for UC admission\n";
        String overallExpected = "Enter your A-G GPA (unweighted): Have you completed all A-G courses? (true/false): " + methodExpected;

        assertEquals(methodExpected, UCEligibiiltyChecker.checkEligibility(2.1, true));
        assertEquals(overallExpected, outputStreamCaptor.toString());
    }

    @Test
    @DisplayName("Ineligible for UC admission - AG Not Met")
    void testIneligibleAG() {
        String input = "3.9\nfalse\n";
        // Create a simulated input stream from the string
        simulatedInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        // Redirect System.in to use the simulated input
        System.setIn(simulatedInput);

        // Call the method that uses the Scanner
        UCEligibiiltyChecker.askAdmissionsQuestions();

        String methodExpected = "\n--- UC Eligibility Results ---\n" +
                "GPA: 3.90\n" +
                "Meets GPA requirement\n" +
                "A-G requirements NOT completed\n" +
                "Final Verdict: NOT eligible for UC admission\n";
        String overallExpected = "Enter your A-G GPA (unweighted): Have you completed all A-G courses? (true/false): " + methodExpected;

        assertEquals(methodExpected, UCEligibiiltyChecker.checkEligibility(3.9, false));
        assertEquals(overallExpected, outputStreamCaptor.toString());
    }
    @Test
    @DisplayName("Ineligible for UC admission - GPA Out of Range")
    void testGPAOutOfRange() {
        String input = "4.1\ntrue\n1.0\ntrue\n";
        // Create a simulated input stream from the string
        simulatedInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        // Redirect System.in to use the simulated input
        System.setIn(simulatedInput);

        // Call the method that uses the Scanner
        UCEligibiiltyChecker.askAdmissionsQuestions();

        String overallExpected = "Enter your A-G GPA (unweighted): Have you completed all A-G courses? (true/false): GPA must be between 0 and 4.\n" +
                "Reenter with correct value.\n" +
                "Enter your A-G GPA (unweighted): Have you completed all A-G courses? (true/false): \n" +
                "--- UC Eligibility Results ---\n" +
                "GPA: 1.00\n" +
                "Does NOT meet GPA requirement\n" +
                "A-G requirements completed\n" +
                "Final Verdict: NOT eligible for UC admission\n";

        assertEquals(overallExpected, outputStreamCaptor.toString());
    }
    @Test
    @DisplayName("Throws IllegalArgumentException - GPA Out of Range")
    void testThrows() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UCEligibiiltyChecker.checkEligibility(4.1, true);
        });

        String expectedMessage = "GPA must be between 0 and 4.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}