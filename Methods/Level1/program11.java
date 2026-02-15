import java.util.Scanner;
import java.lang.Math;

public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        return new double[]{sinValue, cosValue, tanValue};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        scanner.close();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine of %.2f degrees: %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f%n", angle, results[2]);
    }
}