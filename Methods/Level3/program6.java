import java.util.Scanner;

public class NumberChecker {

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Perfect Number
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Abundant Number
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Deficient Number
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Strong Number
    public static boolean isStrong(int num) {
        int temp = num;