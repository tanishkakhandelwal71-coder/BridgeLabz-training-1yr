class Employee{
private String;
private int id ;
private String email;

public Employee(String name ,int id ,String email){       //constuctor
this.name = name;
this.id = id;
this.email = email;

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getemail() {
	return email;
}
public void setemail(String email) {
	this.email = email;
}
public String

	






public class EmployeeManagement {
public static void main (String[]args){
Employee e1 = new Employee(name:"rish" , id:1001, email:"rish@gmail.com");
Employee e2 = new Employee(name:"rishi", id:10015, email:"rishi@gmail.com");
Employee e3 = new Employee(name:"rishika" , id:10012, email:"rishika@gmail.com");
Employee e4 = new Employee(name:"rihika" , id:10013, email:"rihika@gmail.com");
Employee e5 = new Employee(name:"risika" , id:10018, email:"risika@gmail.com");

		ArrayList<Employee> al = new ArrayList<>();  //all datatypes are stored in employee class
		
al.add(e1); // 724
al.add(e2);
al.add(e3);
al.add(e4);
al.add(e5);
System.out.println(al);
for(Employee e : al){
	System.out.println(e);
}
Employee updatedEmp = new Employee(name: "arayan", id: 1003, email: "wesd"");
al.set(2,updatedEmp);
System.out.println(al);












}
}


