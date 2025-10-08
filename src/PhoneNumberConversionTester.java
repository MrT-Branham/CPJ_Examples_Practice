/**
 * Tests the PhoneNumberConversion program.
 * @author Mr. Turner
 */
public class PhoneNumberConversionTester {
    public static void main(String[] args) {

        // Test 1: Number 4088675309
        System.out.println("Expected: (408) 867-5309");
        System.out.println("Actual:   " + PhoneNumberConversion.convertPhoneNumber("4088675309"));

        System.out.println();

        // Test 2: Number 1234567890
        System.out.println("Expected: (123) 456-7890");
        System.out.println("Actual:   " + PhoneNumberConversion.convertPhoneNumber("1234567890"));

        System.out.println();

        // Test 3: Number 4088675309
        System.out.println("Expected: (999) 999-9999");
        System.out.println("Actual:   " + PhoneNumberConversion.convertPhoneNumber("9999999999"));
    }
}