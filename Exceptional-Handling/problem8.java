public class ExceptionPropagationExample {

    static void method1() {
        // This will cause ArithmeticException
        int result = 10 / 0;
        System.out.println(result);
    }

    static void method2() {
        method1(); // Exception propagates to this method
    }

    public static void main(String[] args) {

        try {
            method2(); // Exception handled here

        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e);
        }
    }
}