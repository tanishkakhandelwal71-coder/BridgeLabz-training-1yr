import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};   
        int[] arr2 = {2, 4, 5};         

        HashSet<Integer> set = new HashSet<>();

       
        for (int num : arr1) {
            set.add(num);
        }

        boolean isSubset = true;

        
        for (int num : arr2) {
            if (!set.contains(num)) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is NOT a subset of arr1");
        }
    }
}