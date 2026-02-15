import java.util.Scanner;

public class ExceptionDemo {

    // Method to generate the raw IllegalArgumentException and stop the program
    public static void generateException(String text) {
        System.out.println("\n--- Generating Exception ---");
        // This will throw IllegalArgumentException as start index (10) > end index (5)
        String sub = text.substring(10, 5); 
        System.out.println("This line will not be executed.");
    }

    // Method to handle the IllegalArgumentException using try-catch
    public static void handleException(String text) {
        System.out.println("\n--- Handling Exception ---");
        try {
            // This will throw IllegalArgumentException
            String sub = text.substring(10, 5);
            System.out.println("This line will not be executed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues execution after handling the exception.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        // Call the method to generate the Exception first (this will stop execution)
        // generateException(userInput); 
        
        // Call the method to handle the RuntimeException (uncomment the above line to test generateException separately)
        handleException(userInput);
    }
}