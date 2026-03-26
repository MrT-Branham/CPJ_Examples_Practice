import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class TowersOfHanoiTester {

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

    @Test
    void testConstructor1() {
        TowersOfHanoi towers = new TowersOfHanoi(5);
        towers.printTowers();
        String expected = "[[5, 4, 3, 2, 1], [], []]" + System.lineSeparator();
        assertEquals(expected, outputStream.toString());
    }

    @Test
    void testConstructor2() {
        TowersOfHanoi towers = new TowersOfHanoi(8);
        towers.printTowers();
        String expected = "[[8, 7, 6, 5, 4, 3, 2, 1], [], []]" + System.lineSeparator();
        assertEquals(expected, outputStream.toString());
    }

    @Test
    void testMove1() {
        TowersOfHanoi towers = new TowersOfHanoi(3);
        towers.move(3, 0, 2);
        String expected =
                "[[3, 2], [], [1]]" + System.lineSeparator() +
                        "[[3], [2], [1]]" + System.lineSeparator() +
                        "[[3], [2, 1], []]" + System.lineSeparator() +
                        "[[], [2, 1], [3]]" + System.lineSeparator() +
                        "[[1], [2], [3]]" + System.lineSeparator() +
                        "[[1], [], [3, 2]]" + System.lineSeparator() +
                        "[[], [], [3, 2, 1]]" + System.lineSeparator();
        assertEquals(expected, outputStream.toString());
    }

    @Test
    void testMove2() {
        TowersOfHanoi towers = new TowersOfHanoi(8);
        towers.move(8, 0, 2);
        String expected =
                "[[8, 7, 6, 5, 4, 3, 2], [1], []]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 4, 3], [1], [2]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 4, 3], [], [2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 4], [3], [2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 4, 1], [3], [2]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 4, 1], [3, 2], []]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 4], [3, 2, 1], []]" + System.lineSeparator() +
                        "[[8, 7, 6, 5], [3, 2, 1], [4]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5], [3, 2], [4, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 2], [3], [4, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 2, 1], [3], [4]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 2, 1], [], [4, 3]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5, 2], [1], [4, 3]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5], [1], [4, 3, 2]]" + System.lineSeparator() +
                        "[[8, 7, 6, 5], [], [4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6], [5], [4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 1], [5], [4, 3, 2]]" + System.lineSeparator() +
                        "[[8, 7, 6, 1], [5, 2], [4, 3]]" + System.lineSeparator() +
                        "[[8, 7, 6], [5, 2, 1], [4, 3]]" + System.lineSeparator() +
                        "[[8, 7, 6, 3], [5, 2, 1], [4]]" + System.lineSeparator() +
                        "[[8, 7, 6, 3], [5, 2], [4, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 3, 2], [5], [4, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 3, 2, 1], [5], [4]]" + System.lineSeparator() +
                        "[[8, 7, 6, 3, 2, 1], [5, 4], []]" + System.lineSeparator() +
                        "[[8, 7, 6, 3, 2], [5, 4, 1], []]" + System.lineSeparator() +
                        "[[8, 7, 6, 3], [5, 4, 1], [2]]" + System.lineSeparator() +
                        "[[8, 7, 6, 3], [5, 4], [2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6], [5, 4, 3], [2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 6, 1], [5, 4, 3], [2]]" + System.lineSeparator() +
                        "[[8, 7, 6, 1], [5, 4, 3, 2], []]" + System.lineSeparator() +
                        "[[8, 7, 6], [5, 4, 3, 2, 1], []]" + System.lineSeparator() +
                        "[[8, 7], [5, 4, 3, 2, 1], [6]]" + System.lineSeparator() +
                        "[[8, 7], [5, 4, 3, 2], [6, 1]]" + System.lineSeparator() +
                        "[[8, 7, 2], [5, 4, 3], [6, 1]]" + System.lineSeparator() +
                        "[[8, 7, 2, 1], [5, 4, 3], [6]]" + System.lineSeparator() +
                        "[[8, 7, 2, 1], [5, 4], [6, 3]]" + System.lineSeparator() +
                        "[[8, 7, 2], [5, 4, 1], [6, 3]]" + System.lineSeparator() +
                        "[[8, 7], [5, 4, 1], [6, 3, 2]]" + System.lineSeparator() +
                        "[[8, 7], [5, 4], [6, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 4], [5], [6, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 4, 1], [5], [6, 3, 2]]" + System.lineSeparator() +
                        "[[8, 7, 4, 1], [5, 2], [6, 3]]" + System.lineSeparator() +
                        "[[8, 7, 4], [5, 2, 1], [6, 3]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3], [5, 2, 1], [6]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3], [5, 2], [6, 1]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3, 2], [5], [6, 1]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3, 2, 1], [5], [6]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3, 2, 1], [], [6, 5]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3, 2], [1], [6, 5]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3], [1], [6, 5, 2]]" + System.lineSeparator() +
                        "[[8, 7, 4, 3], [], [6, 5, 2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 4], [3], [6, 5, 2, 1]]" + System.lineSeparator() +
                        "[[8, 7, 4, 1], [3], [6, 5, 2]]" + System.lineSeparator() +
                        "[[8, 7, 4, 1], [3, 2], [6, 5]]" + System.lineSeparator() +
                        "[[8, 7, 4], [3, 2, 1], [6, 5]]" + System.lineSeparator() +
                        "[[8, 7], [3, 2, 1], [6, 5, 4]]" + System.lineSeparator() +
                        "[[8, 7], [3, 2], [6, 5, 4, 1]]" + System.lineSeparator() +
                        "[[8, 7, 2], [3], [6, 5, 4, 1]]" + System.lineSeparator() +
                        "[[8, 7, 2, 1], [3], [6, 5, 4]]" + System.lineSeparator() +
                        "[[8, 7, 2, 1], [], [6, 5, 4, 3]]" + System.lineSeparator() +
                        "[[8, 7, 2], [1], [6, 5, 4, 3]]" + System.lineSeparator() +
                        "[[8, 7], [1], [6, 5, 4, 3, 2]]" + System.lineSeparator() +
                        "[[8, 7], [], [6, 5, 4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8], [7], [6, 5, 4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 1], [7], [6, 5, 4, 3, 2]]" + System.lineSeparator() +
                        "[[8, 1], [7, 2], [6, 5, 4, 3]]" + System.lineSeparator() +
                        "[[8], [7, 2, 1], [6, 5, 4, 3]]" + System.lineSeparator() +
                        "[[8, 3], [7, 2, 1], [6, 5, 4]]" + System.lineSeparator() +
                        "[[8, 3], [7, 2], [6, 5, 4, 1]]" + System.lineSeparator() +
                        "[[8, 3, 2], [7], [6, 5, 4, 1]]" + System.lineSeparator() +
                        "[[8, 3, 2, 1], [7], [6, 5, 4]]" + System.lineSeparator() +
                        "[[8, 3, 2, 1], [7, 4], [6, 5]]" + System.lineSeparator() +
                        "[[8, 3, 2], [7, 4, 1], [6, 5]]" + System.lineSeparator() +
                        "[[8, 3], [7, 4, 1], [6, 5, 2]]" + System.lineSeparator() +
                        "[[8, 3], [7, 4], [6, 5, 2, 1]]" + System.lineSeparator() +
                        "[[8], [7, 4, 3], [6, 5, 2, 1]]" + System.lineSeparator() +
                        "[[8, 1], [7, 4, 3], [6, 5, 2]]" + System.lineSeparator() +
                        "[[8, 1], [7, 4, 3, 2], [6, 5]]" + System.lineSeparator() +
                        "[[8], [7, 4, 3, 2, 1], [6, 5]]" + System.lineSeparator() +
                        "[[8, 5], [7, 4, 3, 2, 1], [6]]" + System.lineSeparator() +
                        "[[8, 5], [7, 4, 3, 2], [6, 1]]" + System.lineSeparator() +
                        "[[8, 5, 2], [7, 4, 3], [6, 1]]" + System.lineSeparator() +
                        "[[8, 5, 2, 1], [7, 4, 3], [6]]" + System.lineSeparator() +
                        "[[8, 5, 2, 1], [7, 4], [6, 3]]" + System.lineSeparator() +
                        "[[8, 5, 2], [7, 4, 1], [6, 3]]" + System.lineSeparator() +
                        "[[8, 5], [7, 4, 1], [6, 3, 2]]" + System.lineSeparator() +
                        "[[8, 5], [7, 4], [6, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 5, 4], [7], [6, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 5, 4, 1], [7], [6, 3, 2]]" + System.lineSeparator() +
                        "[[8, 5, 4, 1], [7, 2], [6, 3]]" + System.lineSeparator() +
                        "[[8, 5, 4], [7, 2, 1], [6, 3]]" + System.lineSeparator() +
                        "[[8, 5, 4, 3], [7, 2, 1], [6]]" + System.lineSeparator() +
                        "[[8, 5, 4, 3], [7, 2], [6, 1]]" + System.lineSeparator() +
                        "[[8, 5, 4, 3, 2], [7], [6, 1]]" + System.lineSeparator() +
                        "[[8, 5, 4, 3, 2, 1], [7], [6]]" + System.lineSeparator() +
                        "[[8, 5, 4, 3, 2, 1], [7, 6], []]" + System.lineSeparator() +
                        "[[8, 5, 4, 3, 2], [7, 6, 1], []]" + System.lineSeparator() +
                        "[[8, 5, 4, 3], [7, 6, 1], [2]]" + System.lineSeparator() +
                        "[[8, 5, 4, 3], [7, 6], [2, 1]]" + System.lineSeparator() +
                        "[[8, 5, 4], [7, 6, 3], [2, 1]]" + System.lineSeparator() +
                        "[[8, 5, 4, 1], [7, 6, 3], [2]]" + System.lineSeparator() +
                        "[[8, 5, 4, 1], [7, 6, 3, 2], []]" + System.lineSeparator() +
                        "[[8, 5, 4], [7, 6, 3, 2, 1], []]" + System.lineSeparator() +
                        "[[8, 5], [7, 6, 3, 2, 1], [4]]" + System.lineSeparator() +
                        "[[8, 5], [7, 6, 3, 2], [4, 1]]" + System.lineSeparator() +
                        "[[8, 5, 2], [7, 6, 3], [4, 1]]" + System.lineSeparator() +
                        "[[8, 5, 2, 1], [7, 6, 3], [4]]" + System.lineSeparator() +
                        "[[8, 5, 2, 1], [7, 6], [4, 3]]" + System.lineSeparator() +
                        "[[8, 5, 2], [7, 6, 1], [4, 3]]" + System.lineSeparator() +
                        "[[8, 5], [7, 6, 1], [4, 3, 2]]" + System.lineSeparator() +
                        "[[8, 5], [7, 6], [4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8], [7, 6, 5], [4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[8, 1], [7, 6, 5], [4, 3, 2]]" + System.lineSeparator() +
                        "[[8, 1], [7, 6, 5, 2], [4, 3]]" + System.lineSeparator() +
                        "[[8], [7, 6, 5, 2, 1], [4, 3]]" + System.lineSeparator() +
                        "[[8, 3], [7, 6, 5, 2, 1], [4]]" + System.lineSeparator() +
                        "[[8, 3], [7, 6, 5, 2], [4, 1]]" + System.lineSeparator() +
                        "[[8, 3, 2], [7, 6, 5], [4, 1]]" + System.lineSeparator() +
                        "[[8, 3, 2, 1], [7, 6, 5], [4]]" + System.lineSeparator() +
                        "[[8, 3, 2, 1], [7, 6, 5, 4], []]" + System.lineSeparator() +
                        "[[8, 3, 2], [7, 6, 5, 4, 1], []]" + System.lineSeparator() +
                        "[[8, 3], [7, 6, 5, 4, 1], [2]]" + System.lineSeparator() +
                        "[[8, 3], [7, 6, 5, 4], [2, 1]]" + System.lineSeparator() +
                        "[[8], [7, 6, 5, 4, 3], [2, 1]]" + System.lineSeparator() +
                        "[[8, 1], [7, 6, 5, 4, 3], [2]]" + System.lineSeparator() +
                        "[[8, 1], [7, 6, 5, 4, 3, 2], []]" + System.lineSeparator() +
                        "[[8], [7, 6, 5, 4, 3, 2, 1], []]" + System.lineSeparator() +
                        "[[], [7, 6, 5, 4, 3, 2, 1], [8]]" + System.lineSeparator() +
                        "[[], [7, 6, 5, 4, 3, 2], [8, 1]]" + System.lineSeparator() +
                        "[[2], [7, 6, 5, 4, 3], [8, 1]]" + System.lineSeparator() +
                        "[[2, 1], [7, 6, 5, 4, 3], [8]]" + System.lineSeparator() +
                        "[[2, 1], [7, 6, 5, 4], [8, 3]]" + System.lineSeparator() +
                        "[[2], [7, 6, 5, 4, 1], [8, 3]]" + System.lineSeparator() +
                        "[[], [7, 6, 5, 4, 1], [8, 3, 2]]" + System.lineSeparator() +
                        "[[], [7, 6, 5, 4], [8, 3, 2, 1]]" + System.lineSeparator() +
                        "[[4], [7, 6, 5], [8, 3, 2, 1]]" + System.lineSeparator() +
                        "[[4, 1], [7, 6, 5], [8, 3, 2]]" + System.lineSeparator() +
                        "[[4, 1], [7, 6, 5, 2], [8, 3]]" + System.lineSeparator() +
                        "[[4], [7, 6, 5, 2, 1], [8, 3]]" + System.lineSeparator() +
                        "[[4, 3], [7, 6, 5, 2, 1], [8]]" + System.lineSeparator() +
                        "[[4, 3], [7, 6, 5, 2], [8, 1]]" + System.lineSeparator() +
                        "[[4, 3, 2], [7, 6, 5], [8, 1]]" + System.lineSeparator() +
                        "[[4, 3, 2, 1], [7, 6, 5], [8]]" + System.lineSeparator() +
                        "[[4, 3, 2, 1], [7, 6], [8, 5]]" + System.lineSeparator() +
                        "[[4, 3, 2], [7, 6, 1], [8, 5]]" + System.lineSeparator() +
                        "[[4, 3], [7, 6, 1], [8, 5, 2]]" + System.lineSeparator() +
                        "[[4, 3], [7, 6], [8, 5, 2, 1]]" + System.lineSeparator() +
                        "[[4], [7, 6, 3], [8, 5, 2, 1]]" + System.lineSeparator() +
                        "[[4, 1], [7, 6, 3], [8, 5, 2]]" + System.lineSeparator() +
                        "[[4, 1], [7, 6, 3, 2], [8, 5]]" + System.lineSeparator() +
                        "[[4], [7, 6, 3, 2, 1], [8, 5]]" + System.lineSeparator() +
                        "[[], [7, 6, 3, 2, 1], [8, 5, 4]]" + System.lineSeparator() +
                        "[[], [7, 6, 3, 2], [8, 5, 4, 1]]" + System.lineSeparator() +
                        "[[2], [7, 6, 3], [8, 5, 4, 1]]" + System.lineSeparator() +
                        "[[2, 1], [7, 6, 3], [8, 5, 4]]" + System.lineSeparator() +
                        "[[2, 1], [7, 6], [8, 5, 4, 3]]" + System.lineSeparator() +
                        "[[2], [7, 6, 1], [8, 5, 4, 3]]" + System.lineSeparator() +
                        "[[], [7, 6, 1], [8, 5, 4, 3, 2]]" + System.lineSeparator() +
                        "[[], [7, 6], [8, 5, 4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[6], [7], [8, 5, 4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[6, 1], [7], [8, 5, 4, 3, 2]]" + System.lineSeparator() +
                        "[[6, 1], [7, 2], [8, 5, 4, 3]]" + System.lineSeparator() +
                        "[[6], [7, 2, 1], [8, 5, 4, 3]]" + System.lineSeparator() +
                        "[[6, 3], [7, 2, 1], [8, 5, 4]]" + System.lineSeparator() +
                        "[[6, 3], [7, 2], [8, 5, 4, 1]]" + System.lineSeparator() +
                        "[[6, 3, 2], [7], [8, 5, 4, 1]]" + System.lineSeparator() +
                        "[[6, 3, 2, 1], [7], [8, 5, 4]]" + System.lineSeparator() +
                        "[[6, 3, 2, 1], [7, 4], [8, 5]]" + System.lineSeparator() +
                        "[[6, 3, 2], [7, 4, 1], [8, 5]]" + System.lineSeparator() +
                        "[[6, 3], [7, 4, 1], [8, 5, 2]]" + System.lineSeparator() +
                        "[[6, 3], [7, 4], [8, 5, 2, 1]]" + System.lineSeparator() +
                        "[[6], [7, 4, 3], [8, 5, 2, 1]]" + System.lineSeparator() +
                        "[[6, 1], [7, 4, 3], [8, 5, 2]]" + System.lineSeparator() +
                        "[[6, 1], [7, 4, 3, 2], [8, 5]]" + System.lineSeparator() +
                        "[[6], [7, 4, 3, 2, 1], [8, 5]]" + System.lineSeparator() +
                        "[[6, 5], [7, 4, 3, 2, 1], [8]]" + System.lineSeparator() +
                        "[[6, 5], [7, 4, 3, 2], [8, 1]]" + System.lineSeparator() +
                        "[[6, 5, 2], [7, 4, 3], [8, 1]]" + System.lineSeparator() +
                        "[[6, 5, 2, 1], [7, 4, 3], [8]]" + System.lineSeparator() +
                        "[[6, 5, 2, 1], [7, 4], [8, 3]]" + System.lineSeparator() +
                        "[[6, 5, 2], [7, 4, 1], [8, 3]]" + System.lineSeparator() +
                        "[[6, 5], [7, 4, 1], [8, 3, 2]]" + System.lineSeparator() +
                        "[[6, 5], [7, 4], [8, 3, 2, 1]]" + System.lineSeparator() +
                        "[[6, 5, 4], [7], [8, 3, 2, 1]]" + System.lineSeparator() +
                        "[[6, 5, 4, 1], [7], [8, 3, 2]]" + System.lineSeparator() +
                        "[[6, 5, 4, 1], [7, 2], [8, 3]]" + System.lineSeparator() +
                        "[[6, 5, 4], [7, 2, 1], [8, 3]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3], [7, 2, 1], [8]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3], [7, 2], [8, 1]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3, 2], [7], [8, 1]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3, 2, 1], [7], [8]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3, 2, 1], [], [8, 7]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3, 2], [1], [8, 7]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3], [1], [8, 7, 2]]" + System.lineSeparator() +
                        "[[6, 5, 4, 3], [], [8, 7, 2, 1]]" + System.lineSeparator() +
                        "[[6, 5, 4], [3], [8, 7, 2, 1]]" + System.lineSeparator() +
                        "[[6, 5, 4, 1], [3], [8, 7, 2]]" + System.lineSeparator() +
                        "[[6, 5, 4, 1], [3, 2], [8, 7]]" + System.lineSeparator() +
                        "[[6, 5, 4], [3, 2, 1], [8, 7]]" + System.lineSeparator() +
                        "[[6, 5], [3, 2, 1], [8, 7, 4]]" + System.lineSeparator() +
                        "[[6, 5], [3, 2], [8, 7, 4, 1]]" + System.lineSeparator() +
                        "[[6, 5, 2], [3], [8, 7, 4, 1]]" + System.lineSeparator() +
                        "[[6, 5, 2, 1], [3], [8, 7, 4]]" + System.lineSeparator() +
                        "[[6, 5, 2, 1], [], [8, 7, 4, 3]]" + System.lineSeparator() +
                        "[[6, 5, 2], [1], [8, 7, 4, 3]]" + System.lineSeparator() +
                        "[[6, 5], [1], [8, 7, 4, 3, 2]]" + System.lineSeparator() +
                        "[[6, 5], [], [8, 7, 4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[6], [5], [8, 7, 4, 3, 2, 1]]" + System.lineSeparator() +
                        "[[6, 1], [5], [8, 7, 4, 3, 2]]" + System.lineSeparator() +
                        "[[6, 1], [5, 2], [8, 7, 4, 3]]" + System.lineSeparator() +
                        "[[6], [5, 2, 1], [8, 7, 4, 3]]" + System.lineSeparator() +
                        "[[6, 3], [5, 2, 1], [8, 7, 4]]" + System.lineSeparator() +
                        "[[6, 3], [5, 2], [8, 7, 4, 1]]" + System.lineSeparator() +
                        "[[6, 3, 2], [5], [8, 7, 4, 1]]" + System.lineSeparator() +
                        "[[6, 3, 2, 1], [5], [8, 7, 4]]" + System.lineSeparator() +
                        "[[6, 3, 2, 1], [5, 4], [8, 7]]" + System.lineSeparator() +
                        "[[6, 3, 2], [5, 4, 1], [8, 7]]" + System.lineSeparator() +
                        "[[6, 3], [5, 4, 1], [8, 7, 2]]" + System.lineSeparator() +
                        "[[6, 3], [5, 4], [8, 7, 2, 1]]" + System.lineSeparator() +
                        "[[6], [5, 4, 3], [8, 7, 2, 1]]" + System.lineSeparator() +
                        "[[6, 1], [5, 4, 3], [8, 7, 2]]" + System.lineSeparator() +
                        "[[6, 1], [5, 4, 3, 2], [8, 7]]" + System.lineSeparator() +
                        "[[6], [5, 4, 3, 2, 1], [8, 7]]" + System.lineSeparator() +
                        "[[], [5, 4, 3, 2, 1], [8, 7, 6]]" + System.lineSeparator() +
                        "[[], [5, 4, 3, 2], [8, 7, 6, 1]]" + System.lineSeparator() +
                        "[[2], [5, 4, 3], [8, 7, 6, 1]]" + System.lineSeparator() +
                        "[[2, 1], [5, 4, 3], [8, 7, 6]]" + System.lineSeparator() +
                        "[[2, 1], [5, 4], [8, 7, 6, 3]]" + System.lineSeparator() +
                        "[[2], [5, 4, 1], [8, 7, 6, 3]]" + System.lineSeparator() +
                        "[[], [5, 4, 1], [8, 7, 6, 3, 2]]" + System.lineSeparator() +
                        "[[], [5, 4], [8, 7, 6, 3, 2, 1]]" + System.lineSeparator() +
                        "[[4], [5], [8, 7, 6, 3, 2, 1]]" + System.lineSeparator() +
                        "[[4, 1], [5], [8, 7, 6, 3, 2]]" + System.lineSeparator() +
                        "[[4, 1], [5, 2], [8, 7, 6, 3]]" + System.lineSeparator() +
                        "[[4], [5, 2, 1], [8, 7, 6, 3]]" + System.lineSeparator() +
                        "[[4, 3], [5, 2, 1], [8, 7, 6]]" + System.lineSeparator() +
                        "[[4, 3], [5, 2], [8, 7, 6, 1]]" + System.lineSeparator() +
                        "[[4, 3, 2], [5], [8, 7, 6, 1]]" + System.lineSeparator() +
                        "[[4, 3, 2, 1], [5], [8, 7, 6]]" + System.lineSeparator() +
                        "[[4, 3, 2, 1], [], [8, 7, 6, 5]]" + System.lineSeparator() +
                        "[[4, 3, 2], [1], [8, 7, 6, 5]]" + System.lineSeparator() +
                        "[[4, 3], [1], [8, 7, 6, 5, 2]]" + System.lineSeparator() +
                        "[[4, 3], [], [8, 7, 6, 5, 2, 1]]" + System.lineSeparator() +
                        "[[4], [3], [8, 7, 6, 5, 2, 1]]" + System.lineSeparator() +
                        "[[4, 1], [3], [8, 7, 6, 5, 2]]" + System.lineSeparator() +
                        "[[4, 1], [3, 2], [8, 7, 6, 5]]" + System.lineSeparator() +
                        "[[4], [3, 2, 1], [8, 7, 6, 5]]" + System.lineSeparator() +
                        "[[], [3, 2, 1], [8, 7, 6, 5, 4]]" + System.lineSeparator() +
                        "[[], [3, 2], [8, 7, 6, 5, 4, 1]]" + System.lineSeparator() +
                        "[[2], [3], [8, 7, 6, 5, 4, 1]]" + System.lineSeparator() +
                        "[[2, 1], [3], [8, 7, 6, 5, 4]]" + System.lineSeparator() +
                        "[[2, 1], [], [8, 7, 6, 5, 4, 3]]" + System.lineSeparator() +
                        "[[2], [1], [8, 7, 6, 5, 4, 3]]" + System.lineSeparator() +
                        "[[], [1], [8, 7, 6, 5, 4, 3, 2]]" + System.lineSeparator() +
                        "[[], [], [8, 7, 6, 5, 4, 3, 2, 1]]" + System.lineSeparator();
        assertEquals(expected, outputStream.toString());
    }
}