public class PetDiscount
{
    public static void discount(double[] prices, boolean[] isPet, int nItems)
    {
        boolean flag = false;
        double total = 0.0;
        int pets = 0;

        if (nItems >= 6)
        {
            for (int i = 0; i < isPet.length; i++)
            {
                if (isPet[i] == true)
                {
                    pets++;
                    flag = true;
                }
            }

            if (flag == true && (nItems - pets) >= 5)
            {
                for (int i = 0; i < prices.length ; i++)
                {
                    if (isPet[i] == true)
                    {
                        total = total + prices[i];
                    }
                    else
                    {
                        total = total + prices[i] * .8;
                    }
                }
            }
        }
        System.out.println("Final price after discount " + total );
    }
}