package com.gla.array.Level2;


import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            do {
                System.out.print("Physics marks: ");
                physics[i] = sc.nextInt();
            } while (physics[i] < 0);

            do {
                System.out.print("Chemistry marks: ");
                chemistry[i] = sc.nextInt();
            } while (chemistry[i] < 0);

            do {
                System.out.print("Maths marks: ");
                maths[i] = sc.nextInt();
            } while (maths[i] < 0);

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // Display
        System.out.println("\n--- Result ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + physics[i] +
                    " | Chemistry: " + chemistry[i] +
                    " | Maths: " + maths[i] +
                    " | Percentage: " + percentage[i] +
                    " | Grade: " + grade[i]);
        }
    }
}
