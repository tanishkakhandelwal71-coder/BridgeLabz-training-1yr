import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("I/P => perimeter: ");

        
        if (scanner.hasNextDouble()) {
            double perimeter = scanner.nextDouble();

            // Calculate the side length
            double side = perimeter / 4.0;

          
            System.out.println("O/P => The length of the side is **" + side + "** whose perimeter is **" + perimeter + "**");
        } else {
            System.out.println("Invalid input. Please enter a valid number for the perimeter.");
        }

        scanner.close();
    }
}