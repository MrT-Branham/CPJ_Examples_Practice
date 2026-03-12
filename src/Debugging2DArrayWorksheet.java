import java.util.Arrays;

public class Debugging2DArrayWorksheet {
    public static void main(String[] args) {
        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] jagged = new int[3][3];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

//        printMatrix(test);
//
//        ArrayChallenge3.main(args);
//
//        copyBoard(test);

//        System.out.println(findMax(test));
//        System.out.println(findMax(jagged));

//        printByColumns(jagged);

//        printTable(test);

        int[][] board = new int[3][3];
        setAll(board, 5);
        System.out.println(board[0][0]);  // Output: 0 (should be 5)
    }

    // Problem 1: Declaration and Initialization Error
    public class ArrayChallenge1 {
        public static void main(String[] args) {
            int[][] array2D = new int[3][3]; // Incorrect declaration

            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    array2D[i][j] = i + j;
                }
            }
        }
    }

    // Problem 2: ArrayIndexOutOfBounds Error
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) { // Removed =
            for (int col = 0; col < matrix[row].length; col++) { // Removed =
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Problem 3: Jagged Array Initialization
    public class ArrayChallenge3 {
        public static void main(String[] args) {
            int[][] jagged = new int[3][3];
            jagged[0] = new int[2];
            jagged[1] = new int[4];
            jagged[2] = new int[3];

            for (int row = 0; row < jagged.length; row++) {
                for (int col = 0; col < jagged[row].length; col++) { // Added [row]
                    jagged[row][col] = row * col;
                }
            }

            printMatrix(jagged);
        }
    }

    // Problem 4: Reference Aliasing Error
    public static void copyBoard(int[][] original) {
        int[][] copy = new int[original.length][]; // Replaced with code that copies
        for (int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }

        // Modify the copy
        copy[0][0] = 999;

        System.out.println("Original board [0][0]: ");
        printMatrix(original);
        System.out.println("Copy board [0][0]: ");
        printMatrix(copy);
    }

    // Problem 5: Row and Column Length Confusion
    public static int findMax(int[][] grid) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < grid[0].length; row++) { // Changed to grid.length
            for (int col = 0; col < grid.length; col++) { // Changed to grid[row].length
                if (grid[row][col] > max) {
                    max = grid[row][col];
                }
            }
        }

        return max;
    }

    // Problem 6:  Incorrect Traversal Direction
    public static void printByColumns(int[][] matrix) {
        // Goal: Print each column from top to bottom, left to right
        for (int col = 0; col < matrix[0].length; col++) { // Switched inner and outer loops
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Problem 7: Incorrect Print Formatting
    public static void printTable(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + " "); // Added space to spread out values
            }
            System.out.println(); // Added to start next row
        }
    }

    // Problem 8: Modifying a 2D Array Through a Method
    public static void setAll(int[][] arr, int value) {
        // Removed line that reassigned arr

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = value;
            }
        }
    }
}