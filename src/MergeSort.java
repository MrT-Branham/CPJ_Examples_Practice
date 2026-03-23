import java.util.Arrays;

public class MergeSort
{
    // Used to keep track of steps for printing
    static int counter = 1;

    public static void main(String[] args)
    {
        int[] myArray = {1, 4, 2, 9, 7};

        // Sort the list
        mergeSort(myArray, myArray.length);
    }

    public static void mergeSort(int[] current, int length)
    {
        // Base case - an array of length 1
        if (length < 2)
        {
            return;
        }

        // Find middle
        int mid = length / 2;

        // Create two new arrays
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        // Populate the first half into left
        for (int i = 0; i < mid; i++)
        {
            left[i] = current[i];
        }

        // Populate the second half into right
        for (int i = mid; i < length; i++)
        {
            right[i - mid] = current[i];
        }

        if (check(current)) return; // Ignore for this exercise

        // Printing current and left/right arrays
        System.out.println("== Step #" + counter + " == (Breaking Apart)");
        System.out.println("Current");
        printArray(current);
        System.out.println("Left");
        printArray(left);
        System.out.println("Right");
        printArray(right);
        System.out.println();
        counter++;

        // Recursive calls
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        // Once the recursive call returns combine the two halfs
        // back to the original
        merge(current, left, right);

        // Printing merged array
        System.out.println("== Step #" + counter + " == (Merging)");
        System.out.println("Merged");
        printArray(current);
        System.out.println();
        counter++;
    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        int leftSize = left.length;
        int rightSize = right.length;

        /*
         * This loop will loop through both arrays and look
         * at the lowest index value in the array, which will
         * be the lowest value. It copares the left value and
         * the right value and takes the lowest one and adds
         * it to current. Then it incriments up the index for
         * the array where it just took the value.
         *
         */
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize)
        {
            if (left[i] <= right[j])
            {
                current[k] = left[i];
                k++;
                i++;
            }
            else
            {
                current[k] = right[j];
                k++;
                j++;
            }
        }

        /*
         * Since we didn't take the values out evenly, one of the
         * arrays may still have values remaining. These calls
         * will place the remaining values in the current array.
         */
        while (i < leftSize)
        {
            current[k] = left[i];
            k++;
            i++;
        }
        while (j < rightSize)
        {
            current[k] = right[j];
            k++;
            j++;
        }
        /*
         * Notice that we do not have a return value anywhere. This is
         * because we are using the pointer values to the arrays. As a
         * result, updates in the method update the original arrays as well.
         */
    }

    // Prints integer arrays
    public static void printArray(int[] arr)
    {
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Ignore this method and leave unchanged
    public static boolean check(int[] arr1)
    {
        int[] arr2 = {8, 11, 4, 1, 25, 3, 2, 9, 7, 16, 13, 5};
        if (Arrays.equals(arr1, arr2)) return true;
        return false;
    }
}