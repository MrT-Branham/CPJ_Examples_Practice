import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class RadioActiveDecayTest {


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
    @DisplayName("Test 1")
    void testOne() {
        RadioActiveDecay.calculateRelativeAmount(6, 24);

        String expected =
                "1.000 \n" +
                "0.891 \n" +
                "0.794 \n" +
                "0.707 \n" +
                "0.630 \n" +
                "0.561 \n" +
                "0.500 \n" +
                "0.445 \n" +
                "0.397 \n" +
                "0.354 \n" +
                "0.315 \n" +
                "0.281 \n" +
                "0.250 \n" +
                "0.223 \n" +
                "0.198 \n" +
                "0.177 \n" +
                "0.157 \n" +
                "0.140 \n" +
                "0.125 \n" +
                "0.111 \n" +
                "0.099 \n" +
                "0.088 \n" +
                "0.079 \n" +
                "0.070 \n" +
                "0.063";
        assertEquals(expected, outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Test 2")
    void testTwo() {
        RadioActiveDecay.calculateRelativeAmount(5, 36);

        String expected =
                "1.000 \n" +
                "0.871 \n" +
                "0.758 \n" +
                "0.660 \n" +
                "0.574 \n" +
                "0.500 \n" +
                "0.435 \n" +
                "0.379 \n" +
                "0.330 \n" +
                "0.287 \n" +
                "0.250 \n" +
                "0.218 \n" +
                "0.189 \n" +
                "0.165 \n" +
                "0.144 \n" +
                "0.125 \n" +
                "0.109 \n" +
                "0.095 \n" +
                "0.082 \n" +
                "0.072 \n" +
                "0.063 \n" +
                "0.054 \n" +
                "0.047 \n" +
                "0.041 \n" +
                "0.036 \n" +
                "0.031 \n" +
                "0.027 \n" +
                "0.024 \n" +
                "0.021 \n" +
                "0.018 \n" +
                "0.016 \n" +
                "0.014 \n" +
                "0.012 \n" +
                "0.010 \n" +
                "0.009 \n" +
                "0.008 \n" +
                "0.007";
        assertEquals(expected, outputStreamCaptor.toString().trim());
    }
}