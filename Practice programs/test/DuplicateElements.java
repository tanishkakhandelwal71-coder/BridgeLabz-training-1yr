import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2); 
        al.add(4);
        al.add(5);
        al.add(3); 

        System.out.println("Original List: " + al);

        HashSet<Integer> hs = new HashSet<>(al);

        System.out.println("After removing duplicates: " + hs);
    }
}