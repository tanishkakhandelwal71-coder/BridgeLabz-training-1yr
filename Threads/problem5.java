import java.util.*;

class Ticket extends Thread {
    int id;
    String type;
    int priority;
    int processTime;

    static Random rand = new Random();

    Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        this.processTime = rand.nextInt(5) + 1; // 1–5 sec
    }

    public void run() {
        try {
            System.out.println("Ticket " + id + " [" + type + "] Assigned to " 
                + Thread.currentThread().getName() + " | Priority: " + priority);

            System.out.println("Processing Ticket " + id + "...");
            Thread.sleep(processTime * 1000);

            System.out.println("Completed Ticket " + id + " in " + processTime + " sec");

        } catch (InterruptedException e) {
            System.out.println("Ticket " + id + " interrupted");
        }
    }

    public static void main(String[] args) {

        List<Ticket> tickets = new ArrayList<>();

        // Create 10 tickets
        tickets.add(new Ticket(1, "Critical Bug", 10));
        tickets.add(new Ticket(2, "Feature Request", 4));
        tickets.add(new Ticket(3, "General Query", 2));
        tickets.add(new Ticket(4, "Feedback", 1));
        tickets.add(new Ticket(5, "Critical Bug", 10));
        tickets.add(new Ticket(6, "Feature Request", 4));
        tickets.add(new Ticket(7, "General Query", 2));
        tickets.add(new Ticket(8, "Feedback", 1));
        tickets.add(new Ticket(9, "Critical Bug", 10));
        tickets.add(new Ticket(10, "General Query", 2));

        // Sort by priority (highest first)
        tickets.sort((a, b) -> b.priority - a.priority);

        int agentNum = 1;
        long totalTime = 0;

        for (Ticket t : tickets) {
            t.setName("Agent-" + agentNum++);
            t.setPriority(t.priority);
            t.start();

            try {
                t.join(); // ensures order (priority-based execution)
                totalTime += t.processTime;
            } catch (Exception e) {}
        }

        System.out.println("\nTotal Processing Time: " + totalTime + " seconds");
    }
}