import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add products
        inventory.put("Apple", 10);
        inventory.put("Banana", 5);
        inventory.put("Milk", 2);

        // 2. Customer buys product
        String product = "Banana";
        if (inventory.containsKey(product)) {
            int qty = inventory.get(product) - 5;
            if (qty <= 0) {
                inventory.remove(product); // out of stock
                System.out.println(product + " is out of stock");
            } else {
                inventory.put(product, qty);
            }
        }

        // 3. New shipment arrives
        inventory.put("Milk", inventory.getOrDefault("Milk", 0) + 10);

        // 4. Query product
        String query = "Apple";
        if (inventory.containsKey(query)) {
            System.out.println(query + " available: " + inventory.get(query));
        } else {
            System.out.println(query + " not stocked");
        }

        // Print out-of-stock items
        System.out.println("Out of Stock Products:");
        // (Here removed items are out of stock)
        // Alternatively, track separately if needed

        System.out.println("Current Inventory:");
        for (String key : inventory.keySet()) {
            System.out.println(key + " -> " + inventory.get(key));
        }
    }
}