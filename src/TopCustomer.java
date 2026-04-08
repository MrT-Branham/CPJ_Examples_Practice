import java.util.*;

public class TopCustomer {
    public static String nameOfBestCustomer(ArrayList<Double> sales,
                                            ArrayList<String> customers) {
        double max = sales.get(0);
        String top = " ";

        for (int i = 0; i < sales.size(); i++) {
            if (sales.get(i) >= max) {
                max = sales.get(i);
                top = customers.get(i);
            }
        }
        return top;
    }
}