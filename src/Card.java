import java.util.Scanner;

public class Card
{
    String value;
    String suit;

    public Card(String card){
        //This extracts the value which may be 1 or 2 characters long
        value = card.substring(0, card.length() - 1);

        // The suit is always the last character
        suit = card.substring(card.length() - 1);
    }

    public String getDescription(){
        String valueAsString = "";
        if (value.compareTo("A") == 0)
        {
            valueAsString = "Ace";
        }
        else if (value.compareTo("J") == 0)
        {
            valueAsString = "Jack";
        }
        else if (value.compareTo("Q") == 0)
        {
            valueAsString = "Queen";
        }
        else if (value.compareTo("K") == 0)
        {
            valueAsString = "King";
        }
        else if ((value.compareTo("2") == 0) || (value.compareTo("3") == 0) || (value.compareTo("4") == 0) || (value.compareTo("5") == 0) || (value.compareTo("6") == 0) || (value.compareTo("7") == 0) || (value.compareTo("8") == 0) || (value.compareTo("9") == 0) || (value.compareTo("10") == 0)){
            valueAsString = value;
        }
        else
        {
            System.out.println("Unknown card value!");
            System.exit(0);
        }

        String suitAsString = "";
        if (suit.compareTo("D") == 0)
        {
            suitAsString = "Diamonds";
        }
        else if (suit.compareTo("H") == 0)
        {
            suitAsString = "Hearts";
        }
        else if (suit.compareTo("S") == 0)
        {
            suitAsString = "Spades";
        }
        else if (suit.compareTo("C") == 0)
        {
            suitAsString = "Clubs";
        }
        else
        {
            System.out.println("Unknown suit!");
            System.exit(0);
        }

        return valueAsString + " of " + suitAsString;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the card notation: ");
        String card = in.next();

        Card c = new Card(card);
        System.out.println(c.getDescription());
    }
}