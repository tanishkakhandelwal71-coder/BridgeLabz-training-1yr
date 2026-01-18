import java.util.Scanner;

public class CalculateTotalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for unit price
        System.out.print("Enter the unit price in INR: ");
        double unitPrice = scanner.nextDouble();

        // Prompt for quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Print the total price
        System.out.println("The total purchase price is INR " + **totalPrice** + " if the quantity is " + **quantity** + " and unit price is INR " + **unitPrice** + ".");

        scanner.close();
    }
}