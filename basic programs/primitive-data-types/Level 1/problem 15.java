import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit price (in INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalAmount = unitPrice * quantity;

        // Display the results
        System.out.println("\n--- Purchase Details ---");
        System.out.println("Unit Price: INR " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("The total purchase price is INR " + totalAmount);

        scanner.close();
    }
}