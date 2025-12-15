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

        // TODO: Complete this method.


    }
}