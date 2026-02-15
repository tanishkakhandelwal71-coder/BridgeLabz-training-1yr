import java.util.Random;
import java.util.Scanner;

public class MatrixOperationQ14 {

    // Create Random Matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);   // 0–9 random numbers

        return matrix;
    }

    // Print Matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    // Addition
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    // Subtraction
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    // Multiplication
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nAddition:");
        printMatrix(addMatrix(A, B));

        System.out.println("\nSubtraction:");
        printMatrix(subtractMatrix(A, B));

        if (cols == rows) {
            System.out.println("\nMultiplication:");
            printMatrix(multiplyMatrix(A, B));
        } else {
            System.out.println("\nMultiplication not possible for these dimensions.");
        }

        sc.close();
    }
}