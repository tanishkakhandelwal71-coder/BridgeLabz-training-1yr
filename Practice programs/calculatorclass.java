class Calculator {

    // Method for Addition
    void addition(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // Method for Subtraction
    void subtraction(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    // Method for Multiplication
    void multiplication(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    // Method for Division
    void division(int a, int b) {
        System.out.println("Division = " + (a / b));
    }

    // Method for Modulus
    void modulus(int a, int b) {
        System.out.println("Modulus = " + (a % b));
    }

    public static void main(String[] args) {

        // Object creation
        Calculator c = new Calculator();

        // Method calls
        c.addition(10, 5);
        c.subtraction(10, 5);
        c.multiplication(10, 5);
        c.division(10, 5);
        c.modulus(10, 5);
    }
}