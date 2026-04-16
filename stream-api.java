interface SumOfNumbers{
	
	int SumOfNumber(int a,int b);
}

public class StreamAPI {
	public static void main (String[]args){
	
	// lambda expression for sumofnumber
	SumOfNumbers sum = (int a,int b)->(a+b);
	System.out.println(sum.SumOfNumber(a:11, b:22));
	}
}

	
	
	// (String s)->{
		// s.length();
	//   };
	// positive negative number
	//  (int a)->{
		// return a>0;
	// };
	

		
		