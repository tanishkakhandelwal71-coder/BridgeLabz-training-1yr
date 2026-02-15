import java.util.Scanner;

public class ShortestLongestStringFinder {

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

    // Reusing the 2D array creation logic
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find shortest and longest lengths in a 2D array
    public static int[] findShortestLongestLengths(String[][] wordLengths) {
        if (wordLengths.length == 0) return new int[]{0, 0};

        int shortest = Integer.parseInt(wordLengths[0][1]);
        int longest = Integer.parseInt(wordLengths[0][1]);

        for (String[] row : wordLengths) {
            int currentLength = Integer.parseInt(row[1]);
            if (currentLength < shortest) {
                shortest = currentLength;
            }
            if (currentLength > longest) {
                longest = currentLength;
            }
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = splitTextManually(input);
        String[][] wordLengths = createWordLengthArray(words);
        int[] results = findShortestLongestLengths(wordLengths);

        System.out.println("Shortest string length: **" + results[0] + "**");
        System.out.println("Longest string length: **" + results[1] + "**");
    }
}