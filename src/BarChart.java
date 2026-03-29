import java.util.ArrayList;
import java.util.Scanner;

public class BarChart
{
    /**
     Read a sequence of positive integers from input and construct an
     array list out of them.
     @return an array list of values from user input
     */
    public static ArrayList<Integer> readValues()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter a sequence of positive integers.  "
                + "Enter a negative value to quit: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n >= 0)
        {
            list.add(n);
            n = in.nextInt();
        }
        return list;
    }

    /**
     Return the largest element in the array list.
     @param list the input list
     @return the largest element in list
     */
    public static int findMax(ArrayList<Integer> list)
    {
        int max = list.get(0);
        for (int x : list)
        {
            if (x > max)
            {
                max = x;
            }
        }
        return max;
    }

    /**
     Prints a chart of asterisks based on the input list and largest
     element in the list.
     @param list the input list
     */
    public static void printBarChart(ArrayList<Integer> list)
    {
        int max = findMax(list);
        for (int i = 0; i < list.size(); i++)
        {
            int n = list.get(i);
            // the 40.0 below comes from the maximum number of stars to print
            int stars = (int) (40.0 * n / max);

            for (int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = readValues();
        printBarChart(list);
    }
}