
public class Question9 {
    public static void main(String[] args) {
        // Question 9: Shopping Cart Item
        // Assuming CartItem represents a line item in the cart
        
        CartItem item = new CartItem("Apple", 1.5, 0);
        
        item.addToCart(5); // Add 5 apples
        item.displayTotalCost();
        
        item.removeFromCart(2); // Remove 2 apples
        item.displayTotalCost();
    }
}

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int initialQuantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = initialQuantity;
    }

    public void addToCart(int count) {
        if (count > 0) {
            this.quantity += count;
            System.out.println(count + " " + itemName + "(s) added to cart.");
        }
    }

    public void removeFromCart(int count) {
        if (count > 0 && quantity >= count) {
            this.quantity -= count;
            System.out.println(count + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Cannot remove items.");
        }
    }

    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost for " + quantity + " " + itemName + "(s): $" + total);
    }
}