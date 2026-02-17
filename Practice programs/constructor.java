class Student{
int id;
String name;
Student() {
this(101, "rishi");
System.out.println("default constructor called");
}

Student(int id,String name) {
this.id = id;
this.name = name;
System.out.println("parameterized constructor called");
}

void display() {
System.out.println(id + " " + name);
}
public static void main (String[]args) {
Student s = new Student();
s.display();
}
}


