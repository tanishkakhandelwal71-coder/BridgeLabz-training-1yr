import java.util.Scanner;

public class UppercaseCompare {

    // Method using charAt() to convert lowercase characters to uppercase
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Convert to uppercase using ASCII difference (32)
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
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
        System.out.print("Enter a text string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        // 1. Get uppercase using user-defined method
        String customUppercase = toUpperCaseCustom(userInput);
        System.out.println("\nCustom Uppercase: " + customUppercase);

        // 2. Get uppercase using built-in method
        String builtInUppercase = userInput.toUpperCase();
        System.out.println("Built-in Uppercase: " + builtInUppercase);

        // 3. Compare the two strings using the user-defined comparison method
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);

        // 4. Display the result
        System.out.println("Are the two uppercase strings equal? " + areEqual);
    }
}