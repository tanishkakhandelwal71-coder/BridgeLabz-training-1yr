public class StringExample {
    public static void main(String[] args) {
        String message = "Hello World!";
        
     
        int lengthOfString = message.length();

        System.out.println("The original string is: \"" + message + "\"");
        System.out.println("The length of the string is: " + lengthOfString);
        System.out.println("Iterating through the string:");

       
        for (int i = 0; i < lengthOfString; i++) {
            
            char character = message.charAt(i);
            System.out.println("Character at index " + i + ": " + character);
        }
    }
}
