import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power should be positive.");
            return;
        }

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println("Result = " + result);
    }
}