class vehicle{
	void start(){  //method name start
		system.out.print("vehicle is start");
		
	}
}
class car extends vehicle{
	void fast () {
		system.out.print("car is fast");
		
	}
}
public class singlelevel {
	public static void main (String[] args){
		car c1 = new car();  //for object only child class
		c1.fast();
		c1.start();
	}
}

