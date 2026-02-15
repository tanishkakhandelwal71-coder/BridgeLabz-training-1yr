import java.util.Scanner;

public class DivideChocolates {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates (N): ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children (M): ");
        int numberOfChildren = scanner.nextInt();
        scanner.close();

        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
            return;
        }

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates per child: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}