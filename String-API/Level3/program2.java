import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to Find unique characters in a string using the charAt() method
    public static char[] findUniqueChars(String text) {
        int length = findLength(text);
        char[] uniqueCharsTemp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharsTemp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = uniqueCharsTemp[i];
        }
        return uniqueChars;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find unique characters: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] unique = findUniqueChars(input);
        System.out.println("Unique characters in the string:");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}