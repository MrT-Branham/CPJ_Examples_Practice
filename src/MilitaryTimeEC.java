import java.util.Scanner;

/**
 * Program that prints the number of hours and minutes between
 * two times entered in military time.
 */
public class MilitaryTimeEC
{
    final static int MINUTES_IN_HOUR = 60;
    final static int MINUTES_IN_DAY = 24 * 60;

    public static void main(String[] args) {

        // Create a Scanner to collect user input
        Scanner in = new Scanner(System.in);

        // Collect the new times in military format
        System.out.print("Please enter the first time: ");
        int firstTime = in.nextInt();
        System.out.print("Please enter the second time: ");
        int secondTime = in.nextInt();
        in.close(); // Close Scanner

        // Convert the times to minutes then calculate the time difference and print 
        System.out.println(calculateTimeDifference(firstTime, secondTime));
    }

    /**
     * Converts military time to minutes.
     * @param militaryTime time to convert
     * @return minutes
     */
    public static int convertToMinutes(int militaryTime){
        // Convert the hours to minutes and add the remaining minutes
        return militaryTime / 100 * MINUTES_IN_HOUR + militaryTime % 100;
    }

    /**
     * Calculates the time between two military times.
     * @param startTime as minutes
     * @param endTime as minutes
     * @return formatted time difference
     */
    public static String calculateTimeDifference(int startTime, int endTime)
    {
        // Convert the military times to minutes
        int startMinutes = convertToMinutes(startTime);
        int endMinutes = convertToMinutes(endTime);

        // Calculate the difference in minutes between the times
        int minutes = endMinutes - startMinutes;

        /*
         * This takes care of negative minutes by adding an entire day to the
         * minutes.
         * The % operator makes sure that the total minutes is less than a day
         */
        minutes = (MINUTES_IN_DAY + minutes) % MINUTES_IN_DAY;

        // Calculate new hour and minutes
        int hours = minutes / 60;
        minutes %= 60;

        // Return the formatted result
        return String.format("%d hours %d minutes", hours, minutes);
    }
}