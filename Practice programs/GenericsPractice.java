class Number<T>{
T num;
void setNumber (T num){
this.num=num;

}
T getNumber() {
return num;
}
}
public class GenericsPractice {

public static void main (String[] args){

Number<Integer> n1 = new Number <>();
n1.setNumber (23);
System.out.println(n1.getNumber());

Number<String> n2 = new Number <>();
n2.setNumber("78");
System.out.println(n2.getNumber());

Number<Double> n3 = new Number <>();
n3.setNumber(789.00);
System.out.println(n3.getNumber());
}
}
