class father{
	void power(){
		system.out.print("father has main power");
	}
}
class daughter1 extends father{
	void smart(){
		system.out.print("is smart");
	}
}
class daughter2 extends father{
	void cute(){
		system.out.print("is cute");
	}
}
public class hierarical{
	public static void main(String[] args){
	daughter1.sc = new daughter1();
	sc.smart();
	sc.cute();
	sc.power();
	daughter2.c = new daughter2();
	c.smart();
	c.cute();
	c.power();
	
	}
}
