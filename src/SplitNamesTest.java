import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SplitNamesTest {

    @Test
    @DisplayName("Split Boy Names")
    void testSplitBabyNames1 () {
        try{
            SplitNames.splitBabyNames("babynames.txt");
            Path actual = Paths.get("boynames.txt");
            Path expected = Paths.get("boynamessol.txt");
            long mismatch = Files.mismatch(actual, expected);

            // print the message based on mismatch result
            if(mismatch > 1L) {
                fail("Mismatch occurred in boynames.txt and boynamessol.txt at : " + mismatch);
            }else {
                System.out.println("Files matched");
            }

        }
        catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Test
    @DisplayName("Split Girl Names")
    void testSplitBabyNames2 () {
        try{
            SplitNames.splitBabyNames("babynames.txt");
            Path actual = Paths.get("girlnames.txt");
            Path expected = Paths.get("girlnamessol.txt");
            long mismatch = Files.mismatch(actual, expected);

            // print the message based on mismatch result
            if(mismatch > 1L) {
                fail("Mismatch occurred in girlnames.txt and girlnamessol.txt at : " + mismatch);
            }else {
                System.out.println("Files matched");
            }

        }
        catch (Exception e){
            fail(e.getMessage());
        }
    }
}