import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTester {

    @Test
    void getDescription1() {
        Card test1 = new Card("QS");
        assertEquals("Queen of Spades", test1.getDescription());
    }

    @Test
    void getDescription2() {
        Card test2 = new Card("JD");
        assertEquals("Jack of Diamonds", test2.getDescription());
    }

    @Test
    void getDescription3() {
        Card test3 = new Card("8C");
        assertEquals("8 of Clubs", test3.getDescription());
    }

    @Test
    void getDescription4() {
        Card test4 = new Card("11S");
        assertEquals("Unknown card value!", test4.getDescription());
    }

    @Test
    void getDescription5() {
        Card test5 = new Card("2T");
        assertEquals("Unknown suit!", test5.getDescription());
    }
}
