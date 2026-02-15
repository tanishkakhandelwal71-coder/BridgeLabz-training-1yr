import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the raw NumberFormatException and stop the program
    public static void generateException(String text) {
        System.out.println("\n--- Generating Exception ---");
        // This will throw NumberFormatException if the string is not a valid integer
        int number = Integer.parseInt(text); 
        System.out.println("Parsed number: " + number);
    }

    // Method to handle the NumberFormatException using try-catch
    public static void handleException(String text) {
        System.out.println("\n--- Handling Exception ---");
        try {
            // This will throw NumberFormatException
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues execution after handling the exception.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-numeric string to cause an exception: ");
        String userInput = scanner.nextLine();
        scanner.close();

        // Call the method to generate the Exception first (this will stop execution)
        // generateException(userInput);

        // Call the method to handle the RuntimeException (uncomment the above line to test generateException separately)
        handleException(userInput);
    }
}