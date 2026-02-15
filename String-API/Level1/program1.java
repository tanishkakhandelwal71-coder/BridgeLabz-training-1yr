import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        // Compare using user-defined method
        boolean customResult = compareStringsCustom(str1, str2);
        // Compare using built-in method
        boolean builtInResult = str1.equals(str2);

        System.out.println("\nCustom method result: " + customResult);
        System.out.println("Built-in equals() method result: " + builtInResult);

        // Check if results are the same
        if (customResult == builtInResult) {
            System.out.println("Results are the same: **true**");
        } else {
            System.out.println("Results are the same: **false**");
        }
        scanner.close();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsCustom(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}