import java.util.Arrays;

public class NumberChecker4 {

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 101;

        int[] digits = storeDigits(num);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuck(digits));
    }
}