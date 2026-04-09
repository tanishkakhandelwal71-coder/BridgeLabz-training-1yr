import java.util.ArrayList;
import java.util.List;

public class CollectionFrameworkPractice {
	public static void main (String[]args) {
		List l = new ArrayList();
		List a = new LinkedList();
		List b = new Vector();
		List c = new Stack();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add("Rishika");
		
		System.out.println(l);
		
		ArrayList<String> al = new ArrayList<>();
		System.out.println("ArrayList : " + al);
		al.add("aa");
		al.add("ab");
		al.add("ac");
		al.add("ad");
		
		System.out.println(al);
		
		System.out.println("using simple for loop....");
		
		for(int i = 0;i<al.size();i++){
		System.out.println(al.get(i));
		}
		
		System.out.println("using Each-for loop");
		for (String s:al){
			
		System.out.println(s);
		}
			
			ArrayList<String> al2 = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		System.out.println(al2);
		
		al.addAll(al2);
		
		System.out.println("after addingal2 into al :"+al);
		
			
		
			
		
		
		
		
		
		
	}
}

		
		
		
		
		
		