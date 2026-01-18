import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number (floating point):");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number (floating point):");
        double number2 = scanner.nextDouble();

        // Perform operations
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        // Print results
        System.out.println("The addition value of the two numbers is: " + sum);
        System.out.println("The subtraction value of the two numbers is: " + difference);
        System.out.println("The multiplication value of the two numbers is: " + product);
        System.out.println("The division value of the two numbers is: " + quotient);

        scanner.close();
    }
}