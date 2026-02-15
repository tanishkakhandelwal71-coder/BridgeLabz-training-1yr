import java.util.Scanner;

public class SubstringCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        // Create substring using user-defined method
        String customSubstring = createSubstringCustom(text, startIndex, endIndex);
        // Create substring using built-in method
        String builtInSubstring = text.substring(startIndex, endIndex);

        System.out.println("\nCustom substring: " + customSubstring);
        System.out.println("Built-in substring(): " + builtInSubstring);

        // Compare the two strings
        if (customSubstring.equals(builtInSubstring)) {
            System.out.println("The substrings are the same: **true**");
        } else {
            System.out.println("The substrings are the same: **false**");
        }
        scanner.close();
    }

    // Method to create a substring using charAt()
    public static String createSubstringCustom(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            System.out.println("Invalid indices!");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}