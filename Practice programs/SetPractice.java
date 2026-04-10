import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {
	public static void main (String[]args) {
HashSet<Integer> hs = new HashSet<>();
hs.add(10);
hs.add(23);
hs.add(98);
System.out.println("=======Hashset========");
System.out.println(hs);
LinkedHashSet<Integer> ls = new LinkedHashSet<>();
ls.add(45);
ls.add(56);
ls.add(58);
ls.add(98);
System.out.println("========LinkedSet=====");
System.out.println(ls);
TreeSet<Integer> ts = new TreeSet<>();
ts.add(45);
ts.add(67)
ts.add(82);
ts.add(48);
System.out.println("========TreeSet=========");
System.out.println(ts);




}
}


