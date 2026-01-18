import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Calculate distance in yards and miles
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        // Display the results
        System.out.println("Distance in yards: " + distanceInYards + " yards");
        System.out.println("Distance in miles: " + distanceInMiles + " miles");

        scanner.close();
    }
}