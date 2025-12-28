import java.util.Scanner;

public class BarEntrance
{
    public static void main(String[] args)
    {
        final int MAX_PEOPLE = 100;
        int totalPeople = 0; // Initially empty

        Scanner input = new Scanner(System.in);
        boolean done = false;
        while (!done)
        {
            System.out.println("People entering or leaving: ");
            int change = input.nextInt();
            int newTotal = totalPeople + change;
            if (0 <= newTotal && newTotal <= MAX_PEOPLE)
            {
                totalPeople = newTotal;
                if (totalPeople == MAX_PEOPLE) { done = true; }
            }
            System.out.println("People in bar: " + totalPeople);
        }
        System.out.println("Bar is full");

        input.close();
    }
}