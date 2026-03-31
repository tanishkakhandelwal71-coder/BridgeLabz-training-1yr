public class WrapperAutoExample {
public static void main (String[] args) {

//autoboxing

int a = 10;
Integer i = a; //manual approach
// Integer i = Interger.valueOf(a); //compiler approach

System.out.println("Value: "+i);

//Unboxing


Integer b = 120;
int m = b;  //manual approach
// int m = b.intValue(); //compiler approach
System.out.println("Unboxing: "+m);
}
}
