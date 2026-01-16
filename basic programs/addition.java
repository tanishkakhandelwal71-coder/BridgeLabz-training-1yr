import java.util.Scanner; // Import the Scanner class

public class SumTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first integer from the user
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second integer from the user
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Print the result to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner object to free resources
        scanner.close();
    }
}
