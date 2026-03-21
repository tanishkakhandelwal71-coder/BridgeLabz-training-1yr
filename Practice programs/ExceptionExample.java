public class ExceptionExample {
public static void main(String args[]){

try{
int number = -5;
if(number < 0){
throw new Exception("no negative number");
}
	System.out.println("invalid number");
}
catch (Exception) {
	System.out.println("Exception caught");
}
}
}

	