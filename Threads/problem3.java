class Order implements Runnable {
    int orderId;
    String restaurant;
    int deliveryTime;

    Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    public void run() {
        try {
            System.out.println("Order " + orderId + " Picked Up");
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + orderId + " In Transit");
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + orderId + " Delivered by " 
                                + Thread.currentThread().getName());
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Order(1, "KFC", 2), "Agent1");
        Thread t2 = new Thread(new Order(2, "Dominos", 3), "Agent2");
        Thread t3 = new Thread(new Order(3, "Burger King", 1), "Agent3");
        Thread t4 = new Thread(new Order(4, "Pizza Hut", 4), "Agent4");
        Thread t5 = new Thread(new Order(5, "Subway", 2), "Agent5");

        t1.setPriority(10); // Express
        t2.setPriority(5);  // Standard
        t3.setPriority(3);  // Economy
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}