import java.util.Scanner;

public class SeatingChart
{
    int[][] seats;

    public SeatingChart(int[][] seats){
        this.seats = seats;
    }


    /**
     Prints the price of seats in a grid like pattern.
     */
    public void printSeats()
    {
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                System.out.printf("%3d", seats[i][j]);
            }
            System.out.println();
        }
    }

    /**
     Marks a seat with the price given to 0.
     @param price the price to mark to zero
     */
    public void sellSeatByPrice(int price)
    {
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                if (seats[i][j] == price)
                {
                    seats[i][j] = 0;
                    return;
                }
            }
        }
        System.out.println("Sorry, no seat found with that price.");
    }

    /**
     Marks a seat based on a given row and seat number from input.
     */
    public void sellSeatByNumber()
    {
        System.out.println("Enter the row and seat number you want: ");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        if (row > 0 && row <= seats.length)
        {
            int seat = in.nextInt();
            if (seat > 0 && seat <= seats[seats.length - row].length)
            {
                if (seats[seats.length - row][seat - 1] != 0)
                {
                    seats[seats.length - row][seat - 1] = 0;
                }
                else
                {
                    System.out.println("Sorry, seat already occupied.");
                }
            }
            else
            {
                System.out.println("Sorry, invalid row.");
            }
        }
        else
        {
            System.out.println("Sorry, invalid row.");
        }
    }
}