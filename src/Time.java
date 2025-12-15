import java.util.Scanner;

public class Time
{
    int hour;
    int minute;
    String time;

    public Time(int hour, int minute){
        // TODO: Write this constructor.
    }

    public int compareTo(Time other){
        // TODO: Write this method.
        return -1;
    }

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("To compare two times in military format (24 hr), first enter "
                + "the hour of the first time: ");
        int hour1 = in.nextInt();
        System.out.println("Enter the minutes of the first time: ");
        int minute1 = in.nextInt();

        Time time1 = new Time(hour1, minute1);

        System.out.println("Now enter the hour of the second time: ");
        int hour2 = in.nextInt();
        System.out.println("Enter the minutes of the second time: ");
        int minute2 = in.nextInt();

        Time time2 = new Time(hour2, minute2);

        int result = time1.compareTo(time2);

        if (result == -1)
        {
            System.out.println(time1.time + " comes first.");
        }
        else if (result == 0)
        {
            System.out.println("Both times are the same.");
        }
        else
        {
            System.out.println(time2.time + " comes first.");
        }
    }
}
