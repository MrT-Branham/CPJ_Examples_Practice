import java.util.Scanner;

// P6.10
public class TicketSeller
{
    public static void main(String[] args)
    {
        final int MAX_TICKETS = 100;
        int availableTickets = MAX_TICKETS;
        int buyers = 0;

        Scanner input = new Scanner(System.in);

        while (availableTickets > 0)
        {
            System.out.println("Requested tickets: ");
            int requested = input.nextInt();
            if (requested >= 1 && requested <= availableTickets
                    && requested <= 4)
            {
                buyers++;
                availableTickets = availableTickets - requested;
            }
            System.out.println("Available tickets: " + availableTickets);
        }
        System.out.println("Total number of buyers: " + buyers);
    }
}