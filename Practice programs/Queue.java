import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();

        // Adding elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue: " + q);

        // Access head
        System.out.println("Head element: " + q.peek());

        // Remove elements
        System.out.println("Removed: " + q.poll());
        System.out.println("Removed: " + q.poll());

        System.out.println("Queue after removal: " + q);
    }
}