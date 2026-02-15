import java.util.Scanner;
import java.lang.Math;

public class WindChill {
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Formula: windChill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75)*Math.pow(windSpeed, 0.16)
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (Fahrenheit): ");
        double temp = scanner.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double speed = scanner.nextDouble();
        scanner.close();

        // Check conditions for valid formula (temp <= 50 F and speed >= 3 mph)
        if (Math.abs(temp) <= 50 && speed >= 3) {
            double windChillTemp = calculateWindChill(temp, speed);
            System.out.printf("The wind chill temperature is: %.2f F%n", windChillTemp);
        } else {
            System.out.println("Formula not valid for the given temperature and/or wind speed.");
        }
    }
}