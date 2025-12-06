import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UCEligibilityChecker {

    // Basic UC requirements (simplified for a classroom program)
    // GPA requirement: 3.0 or higher
    // A-G completion: must be true
    // SAT/ACT not required for UC admissions
    public static String checkEligibility(double gpa, boolean agComplete) throws IllegalArgumentException {

        if(gpa < 0 || gpa > 4) throw new IllegalArgumentException("GPA must be between 0 and 4.");

        // Ternary operators for pass/fail conditions
        String gpaStatus = (gpa >= 3.0) ? "Meets GPA requirement" : "Does NOT meet GPA requirement";
        String agStatus = (agComplete) ? "A-G requirements completed" : "A-G requirements NOT completed";

        // Determine overall eligibility using a ternary operator
        boolean eligible = (gpa >= 3.0 && agComplete);
        String finalStatus = eligible ? "Eligible for UC admission" : "NOT eligible for UC admission";

        // Printing results using String.format

        return String.format(
                "\n--- UC Eligibility Results ---\n" +
                        "GPA: %.2f\n" +
                        "%s\n" +
                        "%s\n" +
                        "Final Verdict: %s\n",
                gpa, gpaStatus, agStatus, finalStatus
        );
    }
    public static void askAdmissionsQuestions(){
        String results = "";
        Scanner input = new Scanner(System.in);
        while(results.equals("")) {
            try{
                System.out.print("Enter your A-G GPA (unweighted): ");
                double gpa = input.nextDouble();

                System.out.print("Have you completed all A-G courses? (true/false): ");
                boolean agComplete = input.nextBoolean();

                results = checkEligibility(gpa, agComplete);
            } catch (IllegalArgumentException e) {
                System.out.printf("%s\nReenter with correct value.\n", e.getMessage());
            } catch (InputMismatchException e) {
                System.out.printf("%s\nReenter with the correct type.\n", e.getMessage());
            } finally {
                input.nextLine();
            }
        }
        input.close();
        System.out.print(results);
    }
    public static void main(String[] args){
        String input = "4.1\ntrue\n1.0\ntrue\n";
        // Create a simulated input stream from the string
        ByteArrayInputStream simulatedInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        // Redirect System.in to use the simulated input
        System.setIn(simulatedInput);
        askAdmissionsQuestions();
    }
}