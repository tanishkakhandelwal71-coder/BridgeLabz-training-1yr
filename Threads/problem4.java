class ExamActivity implements Runnable {
    String name;
    int delay;

    ExamActivity(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    public void run() {
        try {
            System.out.println(name + " State: " + Thread.currentThread().getState());

            Thread.sleep(delay * 1000);

            System.out.println(name + " Started | State: " + Thread.currentThread().getState());

            Thread.sleep(2000);

            System.out.println(name + " Completed | State: " + Thread.currentThread().getState());

        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
    }

    public static void main(String[] args) {
        Thread entry = new Thread(new ExamActivity("Student Entry Monitoring", 0));
        Thread paper = new Thread(new ExamActivity("Question Paper Distribution", 5));
        Thread attendance = new Thread(new ExamActivity("Attendance Marking", 10));
        Thread collection = new Thread(new ExamActivity("Answer Sheet Collection", 15));

        // Set priorities
        paper.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);

        System.out.println("Initial State of Threads:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("Paper: " + paper.getState());
        System.out.println("Attendance: " + attendance.getState());
        System.out.println("Collection: " + collection.getState());

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}