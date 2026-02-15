import java.util.Scanner;

public class StringLengthFinder {

    // Method to find the length of a string without using length()
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        scanner.close();

        int customLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Length using custom method: **" + customLength + "**");
        System.out.println("Length using built-in length() method: **" + builtInLength + "**");
    }
}