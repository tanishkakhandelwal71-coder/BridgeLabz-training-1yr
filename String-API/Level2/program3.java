import java.util.Scanner;

public class TextSplitter2DArray {

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

    // Reusing the manual split method logic
    public static String[] splitTextManually(String text) {
        int length = findLength(text);
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
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

    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            // Use String.valueOf() to convert int length to String
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = splitTextManually(input);
        String[][] wordLengths = createWordLengthArray(words);

        System.out.println("--- Tabular Format ---");
        System.out.printf("%-15s %s%n", "Word", "Length");
        System.out.println("------------------------");
        for (String[] row : wordLengths) {
            // Convert length back to Integer for display (as requested in hint e)
            int lengthInt = Integer.parseInt(row[1]);
            System.out.printf("%-15s %d%n", row[0], lengthInt);
        }
    }
}