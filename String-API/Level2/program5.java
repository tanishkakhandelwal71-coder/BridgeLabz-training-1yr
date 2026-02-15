import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if the character is a vowel or consonant
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32); // Convert to lowercase using ASCII
        }

        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string
    // Returns an array where index 0 is vowel count, index 1 is consonant count
    public static int[] findVowelConsonantCount(String str) {
        int[] counts = new int[2]; // counts[0] for vowels, counts[1] for consonants
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String type = checkCharType(c);
            if (type.equals("Vowel")) {
                counts[0]++;
            } else if (type.equals("Consonant")) {
                counts[1]++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] result = findVowelConsonantCount(input);
        System.out.println("Vowels count: " + **result[0]**);
        System.out.println("Consonants count: " + **result[1]**);

        scanner.close();
    }
}