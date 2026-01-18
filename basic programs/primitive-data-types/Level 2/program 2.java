import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base in cm: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height in cm: ");
        double height = scanner.nextDouble();

        // Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output the results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm + ".");

        scanner.close();
    }
}