import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers 0-9
            }
        }
        return matrix;
    }

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    // Method to find transpose
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse not possible.");
            return null;
        }

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse not possible.");
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows (2 or 3): ");
        int rows = sc.nextInt();

        System.out.print("Enter columns (2 or 3): ");
        int cols = sc.nextInt();

        double[][] matrix = createRandomMatrix(rows, cols);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (rows == 2 && cols == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);

            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                displayMatrix(inv);
            }
        }

        if (rows == 3 && cols == 3) {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);

            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                displayMatrix(inv);
            }
        }

        sc.close();
    }
}