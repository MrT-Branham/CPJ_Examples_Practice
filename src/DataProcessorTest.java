import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataProcessorTest {
    @Test
    @DisplayName("Valid Data")
    void testValidData() {
        assertTrue(DataProcessor.isValidData("1,3,5,9,4,2,0,6"));
    }

    @Test
    @DisplayName("Ends with a Comma")
    void testInvalidEnding() {
        assertFalse(DataProcessor.isValidData("9,5,6,7,8,1,"));
    }

    @Test
    @DisplayName("Comma at Wrong Index")
    void testInvalidCommaPosition() {
        assertFalse(DataProcessor.isValidData("4,,8"));
    }

    @Test
    @DisplayName("Two Digit Number")
    void testInvalidDigits() {
        assertFalse(DataProcessor.isValidData("5,6,36,4"));
    }

    @Test
    @DisplayName("Invalid Character")
    void testInvalidCharacter() {
        assertFalse(DataProcessor.isValidData("7,6,1,j,4,2"));
    }
}