import java.util.Scanner;

public class DelimiterExample {

    public static void main(String[] args) {
        Scanner input = new Scanner("11/07");
        input.useDelimiter("/");
        System.out.println(input.next());
        System.out.println(input.next());
    }
}