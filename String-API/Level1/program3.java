import java.util.Arrays;
import java.util.Scanner;

public class CharArrayCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Get characters using user-defined method
        char[] customChars = getCharsCustom(text);
        // Get characters using built-in toCharArray() method
        char[] builtInChars = text.toCharArray();

        System.out.println("\nCustom char array: " + Arrays.toString(customChars));
        System.out.println("Built-in char array: " + Arrays.toString(builtInChars));

        // Compare the two arrays
        boolean areEqual = compareCharArrays(customChars, builtInChars);
        System.out.println("The char arrays are equal: **" + areEqual + "**");
        scanner.close();
    }

    // Method to return characters without using toCharArray()
    public static char[] getCharsCustom(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two string arrays (char arrays)
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}