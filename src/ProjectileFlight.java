import java.util.Scanner;

public class ProjectileFlight
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final double DELTA_T = 0.01;
        double veloc;

        System.out.println("Enter the initial velocity in m/sec: ");
        veloc = in.nextDouble();

        System.out.println("      Incremented   Calculated");
        System.out.println("      Distance     Distance");
        System.out.println("sec      (m)         (m)");

        final double G = 9.81;

        double s = 0;
        double v = veloc;
        int seconds = 0;

        while (s >= 0)
        {
            int i = 1;
            while (i <= 100)
            {
                s = s + v * DELTA_T;
                v = v - G * DELTA_T;
                i++;
            }
            seconds++;
            double pos = -1 / 2.0 * G * seconds * seconds + veloc * seconds;
            System.out.printf(" %d      %.2f     %.2f \n", seconds, s, pos);
        }
    }
}