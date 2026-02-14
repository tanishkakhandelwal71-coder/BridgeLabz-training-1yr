import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num >= 0) {
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " = " + factorial);
        } else {
            System.out.println("Factorial not defined for negative numbers.");
        }
    }
}