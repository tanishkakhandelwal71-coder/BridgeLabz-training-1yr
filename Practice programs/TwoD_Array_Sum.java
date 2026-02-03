import java.util.Scanner;

public class TwoD_Array_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSum = 0;

       
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

       
        int[][] matrix = new int[rows][columns];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter element at matrix[%d][%d]: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                totalSum += matrix[i][j];
            }
        }

        
        System.out.println("\nYour entered 2D array (matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }

        System.out.println("\nSum of all elements in the 2D array is: " + totalSum);

        
        input.close();
    }
}
