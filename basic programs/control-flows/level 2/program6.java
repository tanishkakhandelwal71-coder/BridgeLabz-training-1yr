import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();

        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        double h1 = sc.nextDouble();
        double h2 = sc.nextDouble();
        double h3 = sc.nextDouble();

        int youngest = Math.min(age1, Math.min(age2, age3));
        double tallest = Math.max(h1, Math.max(h2, h3));

        System.out.println("Youngest age is: " + youngest);
        System.out.println("Tallest height is: " + tallest);

        sc.close();
    }
}