package com.gla.array.Level2;


import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 0=Physics,1=Chemistry,2=Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0)
                        System.out.print("Physics marks: ");
                    else if (j == 1)
                        System.out.print("Chemistry marks: ");
                    else
                        System.out.print("Maths marks: ");

                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0);
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
                    " | Physics: " + marks[i][0] +
                    " | Chemistry: " + marks[i][1] +
                    " | Maths: " + marks[i][2] +
                    " | Percentage: " + percentage[i] +
                    " | Grade: " + grade[i]);
        }
    }
}
