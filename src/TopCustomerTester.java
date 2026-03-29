import java.util.ArrayList;
import java.util.Scanner;

public class TopCustomerTester {

    public static void main(String[] args)
    {
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> names = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        boolean done = false;
        int i = 0;

        while (!done)
        {
            System.out.println("Enter the price: " );
            double d = in.nextDouble();
            if (d == 0)
            {
                done = true;
            }
            else
            {
                price.add(d);
                System.out.println("Customer's last name: ");
                names.add(in.next());
                i++;
            }
        }
        System.out.println("Best customer's name "
                + TopCustomer.nameOfBestCustomer(price, names));
    }
}