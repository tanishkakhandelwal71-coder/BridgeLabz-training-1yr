import java.util.Scanner;
public class SwitchExample{
    public static void main(String[] args){
	Scanner ab = new Scanner(System.in);
	int a;
		 System.out.print("enter a number");
	a = ab.nextInt ();
	switch(a) {
	case 1 : System.out.print("hello");
	break;
		case 2 : System.out.print("java");
break;
	default : System.out.print("byee");
	break;
	}
	
	ab.close();
	}
}
	

