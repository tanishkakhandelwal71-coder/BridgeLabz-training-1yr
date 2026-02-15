import java.util.Scanner;

public class CharacterTypeDisplay {

    // Method to check if the character is a vowel or consonant
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32); // Convert to lowercase using ASCII
        }

        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find characters and their types in a 2D array
    public static String[][] findCharactersAndTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }
        return result;
    }

    // Method to display the 2D Array of Strings in a Tabular Format
    public static void displayTable(String[][] data) {
        System.out.printf("%-15s %-15s%n", "Character", "Type");
        System.out.println("-------------------------------");
        for (String[] row : data) {
            System.out.printf("%-15s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[][] characterTypes = findCharactersAndTypes(input);
        **displayTable(characterTypes)**;

        scanner.close();
    }
}