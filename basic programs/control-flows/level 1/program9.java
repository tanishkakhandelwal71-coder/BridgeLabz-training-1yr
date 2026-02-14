import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched 🚀");

        sc.close();
    }
}