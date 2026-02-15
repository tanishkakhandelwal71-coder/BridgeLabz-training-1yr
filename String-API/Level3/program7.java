public class PalindromeChecker {

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reversal
    public static boolean isPalindromeLogic3(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[text.length()];
        
        // Reverse the string using charAt() and store in reverseArray
        for (int i = 0; i < text.length(); i++) {
            reverseArray[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare original and reverse arrays
        for (int i = 0; i < text.length(); i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        String testText = "madam";
        System.out.println("Testing text: \"" + testText + "\"");

        // Check using Logic 1
        System.out.println("Logic 1 Result: " + isPalindromeLogic1(testText));

        // Check using Logic 2
        System.out.println("Logic 2 Result: " + isPalindromeLogic2(testText, 0, testText.length() - 1));

        // Check using Logic 3
        System.out.println("Logic 3 Result: " + isPalindromeLogic3(testText));
    }
}