import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ContentsCountTest {
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
    @DisplayName("File used babynames.txt")
    void testPrintContentsCounts1 () {
        ContentsCount.printContentsCounts("babynames.txt");
        String expected =
                """
                        Characters: 7353
                        Lines: 200
                        Words: 1400
                        """;
        assertEquals(expected, outputStreamCaptor.toString());
    }

    @Test
    @DisplayName("File used girlnamessol.txt")
    void testPrintContentsCounts2 () {
        ContentsCount.printContentsCounts("girlnamessol.txt");
        String expected =
                """
                        Characters: 1241
                        Lines: 200
                        Words: 200
                        """;
        assertEquals(expected, outputStreamCaptor.toString());
    }
}