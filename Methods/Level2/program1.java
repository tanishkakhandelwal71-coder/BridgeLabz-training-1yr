import java.util.Scanner;

public class FactorsProgram {

    public static int[] getFactors(int n) {
        int count = 0;

        // Count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int product(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.println("Factors are:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}