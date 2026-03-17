class dog{
	void barks(){
		system.out.print("dog barks");
	}
}

class puppy extends dog{
	void cry(){
		system.out.print("puppy crys");
	}
}
 class cat extends puppy{
	 void kittens(){
		 system.out.print("cat gives kitten");
	 }
 }
 public class Multilevel{ 
 public static void main (String[] args){
	 cat c = new cat();
	 c.barks();
	 c.cry();
	 c.kittens();
 }
 }
 