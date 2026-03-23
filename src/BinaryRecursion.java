public class BinaryRecursion
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 8, 11, 14, 19, 20};

        // The recursive method takes the initial min
        // and max indices as parameters
        int index1 = binaryRec(arr1, 8, 0, arr1.length - 1);
        // int index2 = binaryRec(arr1, 30, 0, arr1.length - 1);
        // int index3 = binaryRec(arr1, 40, 0, arr1.length - 1);
    }

    public static int binaryRec(int[] array, int target, int begin, int end)
    {
        // Base case - Target not found!
        if (begin > end)
        {
            return -1;
        }

        // Calculate the midpoint based on the current begining and
        // ending points
        int mid = (begin + end) / 2;

        // Print out the search state of the array
        printArray(array, target, begin, mid, end);

        // Base Case - Target found!
        if (target == array[mid])
        {
            return mid;
        }

        // Midpoint is too high
        else if (target < array[mid])
        {
            // Recursive call replacing the end point with the
            // index below the mid-point.
            return binaryRec(array, target, begin, mid - 1);
        }

        // Midpoint is too low
        else
        {
            // Recursive call replacing the begin point with the
            // index above the mid-point.
            return binaryRec(array, target, mid + 1, end);
        }
    }

    // Method to print out array and search range / process
    public static void printArray(int[] arr, int target, int beginning, int middle, int end)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (i == beginning && (beginning == end && arr[beginning] == target))
            {
                System.out.println(i + ": " + arr[i] + " (Target found!)");
            }
            else if (i == middle && arr[middle] == target)
            {
                System.out.println(i + ": " + arr[i] + " (Target found!)");
            }
            else if (i == beginning && (beginning == end && arr[beginning] != target))
            {
                System.out.println(i + ": " + arr[i] + " (Last test, target not found!)");
            }
            else if (i == beginning)
            {
                System.out.println(i + ": " + arr[i] + " (Beginning)");
            }
            else if (i == middle)
            {
                System.out.println(i + ": " + arr[i] + " (Middle)");
            }
            else if (i == end)
            {
                System.out.println(i + ": " + arr[i] + " (End)");
            }
            else
            {
                System.out.println(i + ": " + arr[i]);
            }
        }
        System.out.println();
    }
}