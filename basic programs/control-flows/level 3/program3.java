import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 80)
            System.out.println("Grade A");
        else if (average >= 70)
            System.out.println("Grade B");
        else if (average >= 60)
            System.out.println("Grade C");
        else if (average >= 50)
            System.out.println("Grade D");
        else if (average >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");

        sc.close();
    }
}