class BankAccount implements Runnable {
    String name;
    String type;
    int priority;

    BankAccount(String name, String type, int priority) {
        this.name = name;
        this.type = type;
        this.priority = priority;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " (" + type + ") checking balance | Priority: " 
                               + Thread.currentThread().getPriority());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new BankAccount("User1", "Premium", 10));
        Thread t2 = new Thread(new BankAccount("User2", "Regular", 5));
        Thread t3 = new Thread(new BankAccount("User3", "Basic", 1));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}