class helloworld {
static int emailid;
}
public class demo1 {
static int x = 50;   //static variable
int z = 60;           //instance variable
public static void m2()  {  
int y = 30;      //local variable
system.out.println("m2 local var " + y);  //uses y from m2
}
public static void m1() {
int y = 20;     //local variable
system.out.println("m1 local var " + y);  //uses y from m2
m2() ;
}
public static void main(string[] args) {
int y = 10;
system.out.println("helloworld ");   //print statement no memory storage uses cpu only
system.out.println("main static var x" + x);    //access static variable stored in method area not in stack
system.out.println("m1 local var y " + y);   //uses y from main stack frame 
m1();
demo1 obj = new demo();
system.out.println("instance/non-static/object-level var " + obj.z);  //uses object reference from stack and access z from heap
}
}
