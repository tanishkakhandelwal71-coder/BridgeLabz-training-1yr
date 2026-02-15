import java.util.Scanner;

public class BMICalculator {

    // Method to find the BMI and status of every person
    public static String[][] findBMIAndStatus(double weight, double heightCm) {
        // Convert height from cm to meters
        double heightM = heightCm / 100.0;
        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);
        
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25.0) {
            status = "Normal";
        } else if (bmi < 30.0) { // Assuming 30.0 for Obesity based on standard ranges
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Return as a 2D String array for a single person's data
        return new String[][]{{String.valueOf(heightCm), String.valueOf(weight), String.format("%.2f", bmi), status}};
    }

    // Method that takes the 2D array of height and weight as parameters
    public static String[][] processData(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String[][] personResult = findBMIAndStatus(data[i][0], data[i][1]);
            results[i] = personResult[0];
        }
        return results;
    }

    // Method to display the 2D string array in a tabular format
    public static void displayData(String[][] results) {
        System.out.println("Person's Height (cm) | Weight (kg) | BMI | Status");
        System.out.println("----");
        for (String[] row : results) {
            System.out.printf("%-20s | %-11s | %-3s | %-10s%n", row[0], row[1], row[2], row[3]);
        }
    }
    
    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMembers = 10;
        double[][] personData = new double[numMembers][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < numMembers; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        scanner.close();

        String[][] results = processData(personData);
        displayData(results);
    }
}