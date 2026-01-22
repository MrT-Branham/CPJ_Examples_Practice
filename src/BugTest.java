import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BugTest {

    @Test
    void test1(){
        Bug bug = new Bug(1);
        bug.move();
        bug.move();
        bug.move();
        bug.turn();
        bug.move();
        bug.move();
        bug.turn();
        bug.move();
        assertEquals(3, bug.getPosition());
    }

    @Test
    void test2(){
        Bug bug = new Bug(-3);
        bug.move();
        bug.move();
        bug.move();
        bug.turn();
        bug.move();
        bug.move();
        bug.turn();
        bug.move();
        bug.turn();
        bug.move();
        assertEquals(-2, bug.getPosition());
    }
}
