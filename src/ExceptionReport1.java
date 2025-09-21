import java.util.Scanner;

/**
 * Prompts user for a favorite number and then asks
 * whether they prefer twice their number instead.
 */
public class ExceptionReport1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        int favorite = in.nextInt();
        System.out.printf("Wouldn't you rather %d?" +
                " It's twice your favorite number.", favorite * 2);
    }
}