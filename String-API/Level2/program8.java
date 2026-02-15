import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            // Generate age between 10 and 99 (inclusive of 10, exclusive of 100)
            ages[i] = rand.nextInt(90) + 10; 
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);
            if (age < 0) {
                results[i][1] = "Cannot vote (Invalid age)";
            } else if (age >= 18) {
                results[i][1] = "Can vote (true)";
            } else {
                results[i][1] = "Cannot vote (false)";
            }
        }
        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s | %-25s%n", "Age", "Voting Status");
        System.out.println("------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s | %-25s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students (e.g., 10): ");
        int numStudents = scanner.nextInt();

        // Call user-defined methods
        int[] ages = generateAges(numStudents);
        String[][] votingStatus = checkVotingEligibility(ages);
        displayResults(votingStatus);
    }
}