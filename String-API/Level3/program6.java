import java.util.Scanner;

public class CharacterFrequency {

    public static String[] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray();
        int[] frequencies = new int[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            frequencies[i] = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (characters[i] == characters[j]) {
                    frequencies[i]++;
                    characters[j] = '0'; // Mark as visited
                }
            }
        }
        
        String[] results = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (characters[i] != '0') {
                results[i] = characters[i] + ": " + frequencies[i];
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String[] frequencies = findCharacterFrequencies(inputString);

        System.out.println("Character frequencies:");
        for (String result : frequencies) {
            if (result != null) {
                System.out.println(result);
            }
        }
    }
}