public class FibonacciSequence {

    /**
     * Determines the Fibonacci number using iteration.
     * @param n index in the Fibonacci sequence
     * @return the Fibonacci number
     */
    public static int fibIterative(int n){
        //Holds the values of the previous two terms
        int fibOld2 = 0;
        int fibOld1 = 1;

        //Returns the first two numbers
        if (n < 1)
        {
            return(fibOld2);
        }
        if (n == 1)
        {
            return(fibOld1);
        }

        //Iterates until n is reached
        for (int i = 2; i <= n; i++)
        {
            //Temporary variable to hold the new value
            int fnew = fibOld1 + fibOld2;

            //Updates fibOld1 and fibOld2
            fibOld2 = fibOld1;
            fibOld1 = fnew;
        }
        return fibOld1;
    }

    /**
     * Determines the Fibonacci number using recursion.
     * @param n index in the Fibonacci sequence
     * @return the Fibonacci number
     */
    public static int fibRecursive(int n)
    {
        //For testing
        //System.out.println("called");

        //Special or base case
        //If the index is 0 or 1, return itself
        if (n <= 1){
            return n;
        }

        //Regular case
        //If the is greater than 2, return the previous two Fibonacci numbers
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}
