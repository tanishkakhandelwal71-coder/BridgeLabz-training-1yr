import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        // LinkedHashMap maintains insertion order
        Map<String, Double> cart = new LinkedHashMap<>();

        // 1. Add products
        cart.put("Laptop", 1200.00);
        cart.put("Mouse", 25.50);
        cart.put("Keyboard", 45.00);

        System.out.println("Items in Cart (Order added):");
        double total = 0;
        for (Map.Entry<String, Double> item : cart.entrySet()) {
            System.out.println(item.getKey() + ": $" + item.getValue());
            total += item.getValue();
        }
        System.out.println("Total Price: $" + total);
    }
}