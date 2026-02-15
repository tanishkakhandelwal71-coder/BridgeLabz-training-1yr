
public class Question7 {
    public static void main(String[] args) {
        // Question 7: Product Inventory
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.00);
        
        p1.displayProductDetails();
        p2.displayProductDetails();
        
        Product.displayTotalProducts();
    }
}

class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // Class variable

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}