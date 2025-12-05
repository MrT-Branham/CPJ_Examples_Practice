public class DataProcessor {

    public static boolean isValidData (String data) {
        try {
            for (int i = 0; i < data.length(); i++) {
                char ch = data.charAt(i);
                if(i == data.length() - 1 && ch == ',') throw new NumberFormatException("Must end with a number.");
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
                        if(i % 2 == 1) throw new NumberFormatException("Only numbers at even indices.");
                        break;
                    case ',':
                        // Must be odd index
                        if(i % 2 == 0) throw new NumberFormatException("Only commas at odd indices.");
                        break;
                    default: throw new NumberFormatException("Invalid character.");
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
            return false;
        }
        // Test that the last character is not a comma
        return true;
    }
}
