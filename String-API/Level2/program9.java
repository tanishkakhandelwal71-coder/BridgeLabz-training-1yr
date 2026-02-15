import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    // Method to get the computer's choice (Hint b)
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(choices.length); // Math.random() approach can also be used
        return choices[index];
    }

    // Method to find the winner between the user and the computer (Hint c)
    // Returns 0 for tie, 1 for user win, -1 for computer win
    public static int determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return 0; // Tie
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return 1; // User wins (Hint a rules applied)
        } else {
            return -1; // Computer wins
        }
    }

    // Method to find the average and percentage of wins and return a String 2D array (Hint d)
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userWinPercentage = (double) userWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;
        double tiePercentage = (double) (totalGames - userWins - computerWins) / totalGames * 100;

        String[][] stats = new String[4][2];
        stats[0][0] = "Total Games"; stats[0][1] = String.valueOf(totalGames);
        stats[1][0] = "User Wins (%)"; stats[1][1] = String.format("%.2f%%", userWinPercentage);
        stats[2][0] = "Computer Wins (%)"; stats[2][1] = String.format("%.2f%%", computerWinPercentage);
        stats[3][0] = "Ties (%)"; stats[3][1] = String.format("%.2f%%", tiePercentage);
        
        return stats;
    }

    // Method to display the results of every game and also display the average and percentage wins (Hint e)
    public static void displayResults(String userChoice, String computerChoice, int winner) {
        System.out.println("\nUser chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        if (winner == 1) {
            System.out.println("Result: User wins this round!");
        } else if (winner == -1) {
            System.out.println("Result: Computer wins this round!");
        } else {
            System.out.println("Result: It's a tie!");
        }
    }

    public static void displayOverallStats(String[][] stats) {
        System.out.println("\n### Game Statistics ###");
        System.out.printf("%-20s | %s%n", "Category", "Value");
        System.out.println("--------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-20s | %s%n", row[0], row[1]);
        }
    }

    // Main method to take user input and call other methods (Hint f)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;
        int totalGames = 0;

        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numGames; i++) {
            System.out.println("\n--- Game " + (i + 1) + " ---");
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Basic input validation (optional but good practice)
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
                userChoice = scanner.nextLine().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            int winner = determineWinner(userChoice, computerChoice);
            displayResults(userChoice, computerChoice, winner);

            if (winner == 1) {
                userWins++;
            } else if (winner == -1) {
                computerWins++;
            }
            totalGames++;
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayOverallStats(stats);

        scanner.close();
    }
}