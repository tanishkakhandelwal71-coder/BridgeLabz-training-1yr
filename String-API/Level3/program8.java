import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {
        // i. Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Convert to lowercase to handle case-insensitivity if needed, or keep as is.
        // Assuming case-sensitive for simplicity based on hints.
        // If we assume only letters, we can use an array of size 26.
        // The hints suggest a general array for characters. Using ASCII range might be better.
        // Let's use a simple array for ASCII characters (0-255)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // iii. Find the frequency of characters in the two texts using the loop
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // iv. Compare the frequency of characters in the two texts.
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        // If all frequencies are equal, they are anagrams
        return true;
    }

    // Main function to take user inputs, call user-defined methods, and displays result.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter second text: ");
        String input2 = scanner.nextLine();

        if (isAnagram(input1, input2)) {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are not anagrams.");
        }

        scanner.close();
    }
}