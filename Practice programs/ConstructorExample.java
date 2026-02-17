public class ConstructorExample{
int id;
String name;
int age;

public ConstructorExample(){
System.out.println("default constructor"); 
}


public ConstructorExample(int id ,String name, int age){
this.id = id;
this.name = name;
this.age = age;
}


void display(){
System.out.println("id :" +id);
System.out.println("name :" +name);
System.out.println("age :" +age);
}


public static void main (String[] args) {
ConstructorExample ce1 = new ConstructorExample();
ConstructorExample ce2 = new ConstructorExample(1,"Rishika", 19);
ce2.display();
}
}
