import java.util.Scanner;

public class FibonacciSequenceTester {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers? ");
        int n = in.nextInt();

        System.out.printf("Iterative: %d, Recursive: %d\n", FibonacciSequence.fibIterative(n), FibonacciSequence.fibRecursive(n));
        in.close();
    }
}
