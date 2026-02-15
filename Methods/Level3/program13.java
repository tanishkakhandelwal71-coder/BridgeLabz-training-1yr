import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Generate random 2-digit PCM scores
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, avg, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to get grade
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Display scorecard
    public static void display(int[][] scores, double[][] results) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    getGrade(results[i][2])
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        display(scores, results);

        sc.close();
    }
}