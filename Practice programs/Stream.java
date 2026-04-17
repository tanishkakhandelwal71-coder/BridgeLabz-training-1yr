public class Stream{
	public static void main (String[]args){
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach( n-> System.out.println(n));
		Stream<String> stream1 = Stream.of("aa","bb","cc","dd");
		stream.forEach(System.out::println);
	}
}
