import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 This program takes in a list of baby names and outputs a list of boys and
 girls names.
 */
public class SplitNames
{
    /**
     Reads name information and returns it.  It also consumes the
     count values on the input line.
     @return the next name
     */
    public static String processName(Scanner in)
    {
        String name = in.next();
        in.nextInt(); // process count
        in.nextDouble(); // process percent
        return name;
    }

    public static void splitBabyNames(String filename) throws IOException
    {
        Scanner in = new Scanner(new File(filename));
        PrintWriter boyOut = new PrintWriter("boynames.txt");
        PrintWriter girlOut = new PrintWriter("girlnames.txt");

        while (in.hasNextInt())
        {
            in.nextInt(); // process rank
            boyOut.println(processName(in));
            girlOut.println(processName(in));
        }
        boyOut.close();
        girlOut.close();
    }
}
