import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the perimeter of the square: ");
        
        // Read the perimeter value from the user
        double perimeter = scanner.nextDouble();

        // Calculate the side length (side = perimeter / 4)
        double side = perimeter / 4.0;

        // Display the result in the specified format
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the scanner resource
        scanner.close();
    }
}