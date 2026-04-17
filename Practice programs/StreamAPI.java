import java.util.stream.Stream;
import java.util.*;

public class StreamAPI{
	public static void main (String[]args){
		Stream<Integer> stream = Stream.of(1,2,3,4,5);  //create stream using .of
		stream.forEach( n-> System.out.println(n));   //lambda
		Stream<String> stream1 = Stream.of("aa","bb","cc","dd");
		stream1.forEach(System.out::println);
	

ArrayList <Integer> al = new ArrayList<>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);

		Stream<Integer> stream2 = al.stream();
		stream2.forEach(System.out::println);
		
		
ArrayList <String> list = new ArrayList<>();
list.add("jay");
list.add("anu");
list.add("tavi");
list.add("krish");
//Stream<String> stream2 = list.stream();
//Stream<String>FilterStream = stream2.filter(n->n.startsWith("A"));
//FilterStream.forEach(System.out::println);


list.stream().filter(n->n.startsWith("A")).forEach(System.out::println);


		
		
		
	}
}
