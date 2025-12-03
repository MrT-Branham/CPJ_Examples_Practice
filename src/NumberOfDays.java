import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int mon = 0;
        System.out.print("Enter the Month Number : ");
        mon = input.nextInt();
        switch(mon) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31 days");
                break;
            case 2:
                System.out.print("28 days");
                break;
            default:
                System.out.print("Invalid month");
        }
    }
}
