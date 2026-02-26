import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 Prints the number of characters, words, and lines in a given file.
 */
public class ContentsCount
{
    /**
     Counts the characters in a file.
     @param line the input line
     @return the number of characters in the line
     */
    public static int countCharacters(String line)
    {
        return line.length();
    }

    /**
     Counts the words in a file.
     @param line the input line
     @return the number of words in a line
     */
    public static int countWords(String line)
    {
        Scanner inLine = new Scanner(line);
        int wordCount = 0;
        while (inLine.hasNext())
        {
            inLine.next(); // process word
            wordCount++;
        }
        return wordCount;
    }

    public static void printContentsCounts(String filename) {
        try
        {
            int characterCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            Scanner inFile = new Scanner(new File(filename));
            while (inFile.hasNextLine())
            {
                String line = inFile.nextLine();
                lineCount++;
                characterCount = characterCount + countCharacters(line);
                wordCount = wordCount + countWords(line);
            }

            System.out.printf("Characters: %d\nLines: %d\nWords: %d\n",
                    characterCount, lineCount, wordCount);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
    }
}
