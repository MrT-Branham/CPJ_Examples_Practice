public class RadioActiveDecay
{
    public static void calculateRelativeAmount(double halfLife, int hours)
    {
        final double LOG2 = Math.log(2);
        for (int t = 0; t <= hours; t++)
        {
            double relativeAmount = Math.exp(-t * LOG2 / halfLife);
            System.out.printf("%.3f \n", relativeAmount);
        }
    }
}