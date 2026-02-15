import java.util.Scanner;

public class StringExceptionDemo {

    // Method to generate the Exception
    public static void generateException(String input) {
        System.out.println("--- Generating StringIndexOutOfBoundsException ---");
        // Accessing an index beyond the length of the string
        // The length is input.length(), so a valid index is 0 to length-1.
        // Accessing input.length() will cause the exception.
        char charAtIndex = input.charAt(input.length()); 
        System.out.println("Character at index " + input.length() + ": " + charAtIndex);
    }

    // Method to handle the Exception
    public static void handleException(String input) {
        System.out.println("--- Handling StringIndexOutOfBoundsException ---");
        try {
            // Accessing an index beyond the length of the string
            char charAtIndex = input.charAt(input.length());
            System.out.println("Character at index " + input.length() + ": " + charAtIndex);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught the exception: " + e.getMessage());
            System.out.println("The index accessed was out of bounds for the string length.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        // Call the method to generate the exception (will stop the program abruptly)
        generateException(userInput);

        // This part of the code will not be reached if generateException causes an abrupt stop
        // handleException(userInput); 
    }
}