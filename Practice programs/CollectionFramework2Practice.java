public class CollectionFramework2Practice {
	public static void main (String[]args) {
	
	
		LinkedList<Integer> ll = new LinkedList<>();
		Vector<Boolean> v  = new Vector<>();
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		
		//LinkedList                                               //insertion =linkedlist,,,,sorting=arraylist
		
		System.out.println(".....LinkedList......");
		
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		
		System.out.println(ll);
		ll.set(0,99);
		LinkedList<Integer> l  = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		ll.addAll(l);
		System.out.println(ll);
		
		
		
		
		
		
		
		
	}
}

		
		
