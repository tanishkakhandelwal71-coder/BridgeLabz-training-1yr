import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Get integer input for numberOfStudents variable.
        System.out.print("Enter the number of students (N): ");
        int numberOfStudents = scanner.nextInt();

        // b. Use the combination = (n * (n-1)) / 2 formula to calculate the maximum number of possible handshakes.
        // Using long to prevent potential overflow for large N
        long handshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;

        // c. Display the number of possible handshakes.
        System.out.println("The maximum number of handshakes is: " + handshakes);

        scanner.close();
    }
}