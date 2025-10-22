import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTester {

    @Test
    void getDescription1 () {
        Card test1 = new Card("QS");
        assertEquals("Queen of Spades", test1.getDescription());
    }

    @Test
    void getDescription2 () {
        Card test2 = new Card("JD");
        assertEquals("Jack of Diamonds", test2.getDescription());
    }

    @Test
    void getDescription3 () {
        Card test3 = new Card("8C");
        assertEquals("8 of Clubs", test3.getDescription());
    }
}