public class WrapperAutoExample {
public static void main (String[] args) {

//autoboxing

long a = 9876543L;
Long i = a; //manual approach
// Long i = Long.valueOf(a); //compiler approach

System.out.println("Value: "+i);

//Unboxing


Long b = 123456780L;
long m = b;  //manual approach
// long m = b.longValue(); //compiler approach
System.out.println("Unboxing: "+m);
}
}
