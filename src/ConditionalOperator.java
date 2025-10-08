import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = input.nextInt();

        int highScore = 10;
        String conclusion = "";

        // Method 1: if/else block
        if (score > highScore){
            System.out.println("New High Score!");
        }
        else{
            System.out.println("Better luck next time...");
        }

        // Method 2: Conditional Operator
        System.out.print(score > highScore ? "New High Score!" : "Better luck next time...");
    }
}
