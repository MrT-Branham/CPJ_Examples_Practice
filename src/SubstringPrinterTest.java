import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SubstringPrinterTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        // Redirect System.out to a ByteArrayOutputStream
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreSystemOut() {
        // Restore the original System.out after each test
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("rum")
    void test1() {
        SubstringPrinter.printAllSubstrings("rum");
        String expectedOutput =
              "r" + System.lineSeparator()
            + "u" + System.lineSeparator()
            + "m" + System.lineSeparator()
            + "ru" + System.lineSeparator()
            + "um" + System.lineSeparator()
            + "rum" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    @DisplayName("brother")
    void test2() {
        SubstringPrinter.printAllSubstrings("brother");
        String expectedOutput =
                "b" + System.lineSeparator() +
                "r" + System.lineSeparator() +
                "o" + System.lineSeparator() +
                "t" + System.lineSeparator() +
                "h" + System.lineSeparator() +
                "e" + System.lineSeparator() +
                "r" + System.lineSeparator() +
                "br" + System.lineSeparator() +
                "ro" + System.lineSeparator() +
                "ot" + System.lineSeparator() +
                "th" + System.lineSeparator() +
                "he" + System.lineSeparator() +
                "er" + System.lineSeparator() +
                "bro" + System.lineSeparator() +
                "rot" + System.lineSeparator() +
                "oth" + System.lineSeparator() +
                "the" + System.lineSeparator() +
                "her" + System.lineSeparator() +
                "brot" + System.lineSeparator() +
                "roth" + System.lineSeparator() +
                "othe" + System.lineSeparator() +
                "ther" + System.lineSeparator() +
                "broth" + System.lineSeparator() +
                "rothe" + System.lineSeparator() +
                "other" + System.lineSeparator() +
                "brothe" + System.lineSeparator() +
                "rother" + System.lineSeparator() +
                "brother" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}