import java.util.Arrays;

public class NumberChecker3 {

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    public static void digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
        }
    }

    public static void main(String[] args) {
        int num = 21;

        int[] digits = storeDigits(num);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(num, digits));

        digitFrequency(digits);
    }
}