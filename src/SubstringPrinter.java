public class SubstringPrinter {

    public static void printAllSubstrings(String word)
    {

        for (int length = 1; length <= word.length(); length++)
        {
            // This loop boundary defines the last position we can reach without
            // going off the end of the string
            for (int pos = 0; pos <= word.length() - length; pos++)
            {
                System.out.println(word.substring(pos, pos + length));
            }
        }
    }
}
