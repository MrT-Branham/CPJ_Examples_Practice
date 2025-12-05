import java.util.zip.DataFormatException;

public class DataProcessor {

    public static boolean isValidData (String data) {
        try {
            for (int i = 0; i < data.length(); i++) {
                char ch = data.charAt(i);
                switch (ch) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        // Must be even index
                        if(i % 2 == 1) throw new DataFormatException();
                        break;
                    case ',':
                        // Must be odd index
                        if(i % 2 == 0) throw new DataFormatException();
                        break;
                    default: throw new DataFormatException();
                }
            }
        }
        catch(DataFormatException e){
            System.out.println("Invalid Data");
            return false;
        }
        // Test that the last character is not a comma
        return data.charAt(data.length() - 1) != ',';
    }
}
