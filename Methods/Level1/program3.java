import java.util.Scanner;

public class AthleteRun {

    public static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double side3 = scanner.nextDouble();
        double rounds = computeRounds(side1, side2, side3);
        System.out.println("The athlete must complete approximately " + rounds + " rounds.");
        scanner.close();
    }
}