import java.util.Scanner;

public class StringTrimmer {

    // Method to trim leading/trailing spaces and return start/end indices
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String subString(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
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
        String originalString = "   Hello World   ";
        
        // Use user-defined trim and substring methods
        int[] indices = trimSpaces(originalString);
        String userTrimmed = subString(originalString, indices[0], indices[1]);
        System.out.println("User-defined trimmed string: \"" + userTrimmed + "\"");

        // Use built-in trim() method
        String builtInTrimmed = originalString.trim();
        System.out.println("Built-in trimmed string:     \"" + builtInTrimmed + "\"");

        // Compare the two strings
        boolean areEqual = compareStrings(userTrimmed, builtInTrimmed);
        System.out.println("Are the strings equal? " + areEqual);
    }
}