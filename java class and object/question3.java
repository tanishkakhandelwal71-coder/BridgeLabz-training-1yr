
public class Question3 {
    public static void main(String[] args) {
        // Question 3: Track Inventory
        Item item = new Item(1001, "Laptop", 75000.0);
        item.displayDetails();
        
        int quantity = 5;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
    }
}

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}