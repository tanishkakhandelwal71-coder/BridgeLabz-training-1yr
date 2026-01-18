import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = scanner.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Convert area to square centimeters (1 inch = 2.54 cm)
        double areaCentimeters = areaInches * 2.54 * 2.54;

        // Output the results
        System.out.println("The area of the triangle in square inches is: " + areaInches + " sq. inches");
        System.out.println("The area of the triangle in square centimeters is: " + areaCentimeters + " sq. cm");

        scanner.close();
    }
}