import java.lang.*;

public class FrenchCountryNames
{
    public static String addFrenchArticleToCountry(String country)
    {

        String pre = "";
        boolean flag = false;

        char n = country.charAt(0);

        if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'A'
                || n == 'E' || n == 'I' || n == 'O' || n == 'U')
        {
            pre = "l'";
            flag = true;
        }
        if (country.equalsIgnoreCase("etats-unis")
                || country.equalsIgnoreCase("pays-bas"))
        {
            pre = "les ";
            flag = true;
        }
        if (!flag)
        {
            if ((country.toLowerCase().charAt(country.length() - 1) == 'e'))
            {
                pre = "la ";
            }
            if (country.equalsIgnoreCase("belize")
                    || country.equalsIgnoreCase("cambodge")
                    || country.equalsIgnoreCase("mexique")
                    || country.equalsIgnoreCase("mozambique")
                    || country.equalsIgnoreCase("zaīre")
                    || country.equalsIgnoreCase("zimbabwe"))
            {
                pre = "le ";
            }
        }
        return pre + country;
    }
}