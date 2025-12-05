import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DataProcessorTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUp () {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown () {
        System.setOut(originalSystemOut);
    }

    @Test
    @DisplayName("Valid Data")
    void testValidData() {
        assertTrue(DataProcessor.isValidData("1,3,5,9,4,2,0,6"));
    }

    @Test
    @DisplayName("Ends with a Comma")
    void testInvalidEnding() {
        assertFalse(DataProcessor.isValidData("9,5,6,7,8,1,"));
        assertEquals("Must end with a number.", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Comma at Wrong Index")
    void testInvalidCommaPosition() {
        assertFalse(DataProcessor.isValidData("4,,8"));
        assertEquals("Only commas at odd indices.", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Two Digit Number")
    void testInvalidDigits() {
        assertFalse(DataProcessor.isValidData("5,6,36,4"));
        assertEquals("Only numbers at even indices.", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Invalid Character")
    void testInvalidCharacter() {
        assertFalse(DataProcessor.isValidData("7,6,1,j,4,2"));
        assertEquals("Invalid character.", outputStreamCaptor.toString().trim());
    }
}