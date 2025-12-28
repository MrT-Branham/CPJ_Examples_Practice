import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class BarEntranceTest {

    private final InputStream originalSystemIn = System.in;
    private ByteArrayInputStream simulatedInput;

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUp () {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown () {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    @DisplayName("Test 1")
    void testOne() {
        String input = "99\n2\n-2\n3\n";
        simulatedInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(simulatedInput);
        BarEntrance.main(new String[0]);

        String expected = "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 99" + System.lineSeparator() +
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 99" + System.lineSeparator() +
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 97" + System.lineSeparator() +
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 100" + System.lineSeparator() +
                "Bar is full";
        assertEquals(expected, outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Test 2")
    void testTwo() {
        String input = "50\n56\n49\n-4\n5\n";
        simulatedInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(simulatedInput);
        BarEntrance.main(new String[0]);

        String expected =
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 50" + System.lineSeparator() +
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 50" + System.lineSeparator() +
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 99" + System.lineSeparator() +
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 95" + System.lineSeparator() +
                "People entering or leaving: " + System.lineSeparator() +
                "People in bar: 100" + System.lineSeparator() +
                "Bar is full";
        assertEquals(expected, outputStreamCaptor.toString().trim());
    }
}