public class NullPointerDemo {

    public static void main(String[] args) {
        System.out.println("--- Generating NullPointerException ---");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught the exception in main: " + e.getMessage());
        }

        System.out.println("\n--- Handling NullPointerException ---");
        handleException();
        
        System.out.println("\nDemonstration complete: **true**");
    }

    // Method to generate the Exception
    public static void generateException() {
        String text = null;
        // Accessing a method on a null reference generates the exception
        System.out.println("Attempting to get length of null string...");
        System.out.println(text.length()); 
    }

    // Method to demonstrate NullPointerException handling using try-catch
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Attempting to get length of null string inside try block...");
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Successfully handled NullPointerException: " + e.getMessage());
        }
    }
}