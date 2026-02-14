package com.gla.array.Level2;


import java.util.Scanner;

public class program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // 0=weight, 1=height, 2=BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Input Weight
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            // Input Height
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            // Find Status
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + personData[i][0] +
                    " | Height: " + personData[i][1] +
                    " | BMI: " + personData[i][2] +
                    " | Status: " + weightStatus[i]);
        }
    }
}
