
public class Question7 {
    public static void main(String[] args) {
        // Question 7: Check Palindrome String
        PalindromeChecker checker = new PalindromeChecker("madam");
        checker.displayResult();
        
        PalindromeChecker checker2 = new PalindromeChecker("hello");
        checker2.displayResult();
    }
}

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}