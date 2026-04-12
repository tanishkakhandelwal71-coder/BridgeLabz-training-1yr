import java.util.*;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(name + " - " + price + " (" + category.getCategoryName() + ")");
    }
}

class Marketplace {
    public static <T extends Category> void showProducts(List<Product<T>> list) {
        for (Product<T> p : list) {
            p.display();
        }
    }

    public static void main(String[] args) {
        List<Product<BookCategory>> books = Arrays.asList(
                new Product<>("Java Book", 500, new BookCategory())
        );

        List<Product<ClothingCategory>> clothes = Arrays.asList(
                new Product<>("T-Shirt", 800, new ClothingCategory())
        );

        showProducts(books);
        showProducts(clothes);
    }
}