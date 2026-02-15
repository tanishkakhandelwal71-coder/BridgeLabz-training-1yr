import java.util.Scanner;

public class TextConverter {

    // Method to convert each character to lowercase if it is uppercase
    public static String toLowerCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase using ASCII difference
                // ASCII value of 'a' is 97 and 'A' is 65, difference is 32
                char lowerCaseChar = (char) (currentChar + 32);
                result += lowerCaseChar;
            } else {
                result += currentChar;
            }
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsCustom(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a complete line of text:");
        String userInput = scanner.nextLine();

        // Get lowercase text using user-defined method
        String customLowerCase = toLowerCaseCustom(userInput);

        // Get lowercase text using built-in method
        String builtInLowerCase = userInput.toLowerCase();

        // Compare the two strings using the user-defined method
        boolean areEqual = compareStringsCustom(customLowerCase, builtInLowerCase);

        System.out.println("\nOriginal Text: " + userInput);
        System.out.println("Custom LowerCase: " + customLowerCase);
        System.out.println("Built-in LowerCase: " + builtInLowerCase);

        if (areEqual) {
            System.out.println("The two lowercase strings are **equal**.");
        } else {
            System.out.println("The two lowercase strings are **not equal**.");
        }
        
        scanner.close();
    }
}