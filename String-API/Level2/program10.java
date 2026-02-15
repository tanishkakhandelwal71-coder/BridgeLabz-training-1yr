import java.util.Random;
import java.util.Scanner;

public class StudentGrading {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM)
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random rand = new Random();
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                // Generate a random 2-digit number (10 to 99)
                scores[i][j] = rand.nextInt(90) + 10;
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentages for each student
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        // total, average, percentage
        double[][] results = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            results[i][0] = total;
            double percentage = (double) total / 300.0 * 100.0;
            // Round off the values to 2 Digits using Math.round()
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
            results[i][1] = Math.round((results[i][0] / 3.0) * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("--- Student Scorecard ---");
        System.out.printf("%-10s %-5s %-5s %-5s %-7s %-7s %-10s %-6s%n", 
                          "Student", "Phy", "Che", "Mat", "Total", "Avg", "Percent", "Grade");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-5d %-5d %-5d %-7.0f %-7.2f %-10.2f %-6s%n", 
                              i + 1, scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateTotalsAndPercentages(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
        
        scanner.close();
    }
}