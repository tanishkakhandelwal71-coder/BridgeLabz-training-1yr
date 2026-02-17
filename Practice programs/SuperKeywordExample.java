//Parent class
class SuperKeywordExample {
	int x = 10; //parent variable 1usage
	//parent constructor
	SuperKeywordExample() {
		system.out.println("SuperKeywordExample constructor called");
	
	}
	//parent method
	void show() {
		system.out.println("SuperKeywordExample method called");
	}
}
//child class
class employee extends SuperKeywordExample {
	int x = 20;  //child variable
Employee() {

// Calling parent constructor
super();

// Access parent variable
System.out.println("Parent variable x = " + super.x);

// Calling parent method
super.show();

System.out.println("Employee Constructor Called");
}

public static void main(String[] args) {
Employee e = new Employee();
}
}
	
	