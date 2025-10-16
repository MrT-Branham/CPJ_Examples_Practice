import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberConversionTest {

    @Test
    void convertPhoneNumber() {
        assertEquals("(408) 867-5309",  PhoneNumberConversion.convertPhoneNumber("4088675309"));
        //assertEquals("1(408) 867-5309",  PhoneNumberConversion.convertPhoneNumber("4088675309"));
    }
}