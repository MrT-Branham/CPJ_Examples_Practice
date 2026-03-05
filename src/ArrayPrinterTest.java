import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayPrinterTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    // -----------------------------
    // Test generateRandomIntegerArray
    // -----------------------------

    @Test
    void testGenerateRandomIntegerArray_Length() {
        int[] result = ArrayPrinter.generateRandomIntegerArray(5);
        assertEquals(5, result.length);
    }

    @Test
    void testGenerateRandomIntegerArray_ValueRange() {
        int numberOfElements = 5;
        int[] result = ArrayPrinter.generateRandomIntegerArray(numberOfElements);

        for (int i = 0; i < numberOfElements; i++) {
            assertTrue(result[i] >= 1 && result[i] <= 100);
        }
    }

    @Test
    void testGenerateRandomIntegerArray_UnfilledElementsAreZero() {
        int numberOfElements = 5;
        int[] result = ArrayPrinter.generateRandomIntegerArray(numberOfElements);

        for (int i = numberOfElements; i < result.length; i++) {
            assertEquals(0, result[i]);
        }
    }

    // -----------------------------
    // Test printEvenIndicies
    // -----------------------------

    @Test
    void testPrintEvenIndicies() {
        int[] data = {1, 2, 3, 4, 5, 6};
        ArrayPrinter.printEvenIndicies(data);

        String expected = "1 3 5 ";
        assertEquals(expected, outputStream.toString());
    }

    // -----------------------------
    // Test printEvenElements
    // -----------------------------

    @Test
    void testPrintEvenElements() {
        int[] data = {1, 2, 3, 4, 5, 6};
        ArrayPrinter.printEvenElements(data);

        String expected = "2 4 6 ";
        assertEquals(expected, outputStream.toString());
    }

    @Test
    void testPrintEvenElements_NoEvenNumbers() {
        int[] data = {1, 3, 5};
        ArrayPrinter.printEvenElements(data);

        String expected = "";
        assertEquals(expected, outputStream.toString());
    }

    // -----------------------------
    // Test printElementsReversed
    // -----------------------------

    @Test
    void testPrintElementsReversed() {
        int[] data = {1, 2, 3};
        ArrayPrinter.printElementsReversed(data);

        String expected = "3 2 1 ";
        assertEquals(expected, outputStream.toString());
    }

    // -----------------------------
    // Test printFirstLastElements
    // -----------------------------

    @Test
    void testPrintFirstLastElements() {
        int[] data = {10, 20, 30, 40};
        ArrayPrinter.printFirstLastElements(data);

        String expected = "10 40";
        assertEquals(expected, outputStream.toString());
    }
}
