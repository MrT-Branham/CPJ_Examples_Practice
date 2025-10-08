import java.util.Scanner;

/**
 * Program that converts a 10-digit phone number into the
 * (###) ###-#### format.
 */
public class PhoneNumberConversion {
    public static void main(String[] args) {
        // Create a Scanner to collect user input
        Scanner in = new Scanner(System.in);

        // Collect the number
        System.out.println("Enter phone number: ");
        String phoneNumber = in.next();
        in.close(); // Close Scanner

        // Convert and print the result
        System.out.println(convertPhoneNumber(phoneNumber));
    }

    /**
     * Converts phone number to the (###) ###-#### format.
     * @param number 10-digit phone number as a String
     * @return the formatted phone number
     */
    public static String convertPhoneNumber(String number)
    {
        // Break the number into three parts
        String areaCode = number.substring(0, 3);
        String prefix = number.substring(3, 6);
        String postfix = number.substring(6, 10);

        // Combine the three parts into the matching format
        return "(" + areaCode + ") " + prefix + "-" + postfix;
    }
}