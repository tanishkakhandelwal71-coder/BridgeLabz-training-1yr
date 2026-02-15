import java.util.Arrays;
import java.util.Scanner;

public class TextSplitterAndComparer {

    // Reusing the length method logic
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words manually
    public static String[] splitTextManually(String text) {
        int length = findLength(text);
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        // Add 1 for the last word
        String[] words = new String[wordCount + 1];
        int wordIndex = 0;
        int startIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        words[wordIndex] = text.substring(startIndex, length);
        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] manualSplit = splitTextManually(input);
        String[] builtInSplit = input.split(" ");

        boolean isEqual = compareStringArrays(manualSplit, builtInSplit);

        System.out.println("Manual split result: " + Arrays.toString(manualSplit));
        System.out.println("Built-in split result: " + Arrays.toString(builtInSplit));
        System.out.println("Arrays are equal: **" + isEqual + "**");
    }
}