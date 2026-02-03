import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[] args) {
        int n, sum = 0;
        
        Scanner s = new Scanner(System.in);
  System.out.print("Enter the size of the array: ");
        n = s.nextInt();
 int[] a = new int[n];
 System.out.println("Enter array elements:");
 for (int i = 0; i < n; i++) {
            a[i] = s.nextInt(); 
            sum = sum + a[i]; 
        }
 s.close();
 System.out.println("Sum of the array is: " + sum);
    }
}
