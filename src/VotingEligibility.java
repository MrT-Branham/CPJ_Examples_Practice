import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        // Check eligibility
        // Method 1: if/else Block
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not yet eligible to vote.");
        }

        // Method 2: Conditional Operator
        System.out.println(age >= 18 ? "You are eligible to vote!":
                "You are not yet eligible to vote.");

        input.close();
    }
}