import java.util.Arrays;

public class NumberChecker2 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    public static void largestTwo(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }

    public static void smallestTwo(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < smallest) {
                second = smallest;
                smallest = n;
            } else if (n < second && n != smallest) {
                second = n;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + second);
    }

    public static void main(String[] args) {
        int num = 153;

        int[] digits = storeDigits(num);

        System.out.println("Count: " + countDigits(num));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(num, digits));

        largestTwo(digits);
        smallestTwo(digits);
    }
}