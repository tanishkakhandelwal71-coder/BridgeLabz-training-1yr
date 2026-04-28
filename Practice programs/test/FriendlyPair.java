public class FriendlyPair {

   
    static int sumOfDivisors(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 28;

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        
        if ((double)sum1 / num1 == (double)sum2 / num2) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not a Friendly Pair");
        }
    }
}
		
