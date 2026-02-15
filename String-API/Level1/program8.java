import java.util.Scanner;

public class ArrayIndexDemo {

    // Method to generate the raw ArrayIndexOutOfBoundsException and stop the program
    public static void generateException(String[] names) {
        System.out.println("\n--- Generating Exception ---");
        // Accessing an index larger than the array length (length is 3, index 3 is invalid)
        String name = names[3]; 
        System.out.println("Accessed name: " + name);
    }

    // Method to handle the ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        System.out.println("\n--- Handling Exception ---");
        try {
            // Accessing an index larger than the array length
            String name = names[3];
            System.out.println("Accessed name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues execution after handling the exception.");
    }

    public static void main(String[] args) {
        // We define a fixed array for demonstration purposes
        String[] userNames = {"Alice", "Bob", "Charlie"};

        // Call the method to generate the Exception first (this will stop execution)
        // generateException(userNames);

        // Call the method to handle the RuntimeException (uncomment the above line to test generateException separately)
        handleException(userNames);
    }
}