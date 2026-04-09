public class GenericsExample {


public static <T> void swap(T a, T b){


System.out.println("Before swapping: " +a+" "+b);
T temp =a ;
a = b;
b = temp;
}


public static void main (String[] args){

swap( 11, 22);
swap(  "aa",  "bb");
}
}
public class FibonacciSeries {
	public static <T> void fibonacci(T a,T b,int n){
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            double next = a.doubleValue() + b.doubleValue();
			
		
		
		






















public class FibonacciGenerics {

    public static <T extends Number> void fibonacci(T a, T b, int n) {

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            double next = a.doubleValue() + b.doubleValue();

            a = b;
            b = (T) Double.valueOf(next); // type casting
        }
    }

    public static void main(String[] args) {

        // Using Integer
        fibonacci(0, 1, 10);

        System.out.println();

        // Using Double
        fibonacci(0.0, 1.0, 10);
    }
}