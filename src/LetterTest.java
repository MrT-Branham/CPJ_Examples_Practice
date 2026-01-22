import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterTest {
    @Test
    void test1(){
        Letter letter = new Letter("Mary", "John");

        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best.");

        String expected = "Dear John:\n\n" +
        "I am sorry we must part.\n" +
        "I wish you all the best.\n\n" +
        "Sincerely,\n\n" +
        "Mary";

        System.out.println(letter.getText());
        assertEquals(expected, letter.getText());
    }

    @Test
    void test2(){
        Letter letter = new Letter("SWE Students", "CPJ Students");

        letter.addLine("Read the textbook - get an A.");
        letter.addLine("Tragic arrogance");
        letter.addLine("Never back down, never give up");
        letter.addLine("Who is going to carry the boats and the logs?");

        String expected = "Dear CPJ Students:\n\n" +
                "Read the textbook - get an A.\n" +
                "Tragic arrogance\n" +
                "Never back down, never give up\n" +
                "Who is going to carry the boats and the logs?\n\n" +
                "Sincerely,\n\n" +
                "SWE Students";

        System.out.println(letter.getText());
        assertEquals(expected, letter.getText());
    }
}
