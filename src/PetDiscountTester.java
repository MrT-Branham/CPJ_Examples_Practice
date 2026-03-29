import java.util.Scanner;

public class PetDiscountTester {

    public static void main(String[] args)
    {
        double[] prices1 = new double[100];
        boolean[] isPet1 = new boolean[100];

        Scanner in = new Scanner(System.in);
        boolean done = false;
        int i = 0;

        while (!done)
        {
            System.out.println("Enter the price, or -1 to quit: " );

            double d = in.nextDouble();
            if (d == -1)
            {
                done = true;
            }
            else
            {
                if (done == false)
                {
                    prices1[i] = d;
                    System.out.println("Is it a pet? y/n" );
                    String t = in.next();

                    if (t.equals("Y") || t.equals("y"))
                    {
                        isPet1[i] = true;
                    }
                    else
                    {
                        isPet1[i] = false;
                    }
                    i++;
                }
            }
        }
        PetDiscount.discount(prices1, isPet1, i);
    }
}
