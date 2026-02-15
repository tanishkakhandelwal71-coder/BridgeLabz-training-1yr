
public class Question4 {
    public static void main(String[] args) {
        // Question 4: Mobile Phone Details
        MobilePhone phone = new MobilePhone("Apple", "iPhone 15", 999.0);
        phone.displayDetails();
    }
}

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}