import java.util.Scanner;

public class student {
    int id;
    String name;
    int age;

    void displayDetails(){
        String status = "Active";
		System.out.println("Status:"+status);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
		
    }


    public static void main(String[] args){
       student s1 = new student();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter student id ");
       s1.id = sc.nextInt();
	   System.out.println("Enter student name");
	   s1.name = sc.next();
	   System.out.println("Enter Student Age");
	   s1.age = sc.nextInt();
	   s1.displayDetails();

    }
}
	