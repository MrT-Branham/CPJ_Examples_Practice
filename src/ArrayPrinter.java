public class ArrayPrinter
{
    public static int[] generateRandomIntegerArray(int numberOfElements){
        int[] data = new int[10];
        for (int i = 0; i < numberOfElements; i++)
        {
            data[i] = (int) (Math.random() * 100 + 1);
        }
        return data;
    }

    // Print out even indices
    public static void printEvenIndicies(int[] data){
        for (int i = 0; i < data.length; i = i + 2) {
            System.out.print(data[i] + " ");
        }
    }

    // Print out even elements
    public static void printEvenElements(int[] data){
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] % 2 == 0)
            {
                System.out.print(data[i] + " ");
            }
        }
    }

    // Print out elements in reverse order
    public static void printElementsReversed(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }

    // Print out only first and last element
    public static void printFirstLastElements(int[] data){
        System.out.printf("%d %d", data[0], data[data.length - 1]);
    }
}