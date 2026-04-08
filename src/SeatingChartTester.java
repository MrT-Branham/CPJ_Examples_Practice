import java.util.Scanner;

public class SeatingChartTester {
    public static void main(String[] args)
    {
        // initial values come from problem description
        int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
                { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
                { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
                { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
                { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
                { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
                { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

        SeatingChart testChart = new SeatingChart(seats);

        testChart.printSeats();

        System.out.println("Pick by <s>eat or <p>rice or <q> to quit: ");
        Scanner in = new Scanner(System.in);
        String choice = in.next();
        while (!choice.equals("q"))
        {
            if (choice.equals("s"))
            {
                testChart.sellSeatByNumber();
            }
            else
            {
                // pick by price
                System.out.println("What price do you want to buy?");
                int price = in.nextInt();
                testChart.sellSeatByPrice(price);
            }
            testChart.printSeats();
            System.out.println("Pick by <s>eat or <p>rice or <q> to quit: ");
            choice = in.next();
        }
    }
}
