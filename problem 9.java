import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void showItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

class TestCart {
    public static void main(String[] args) {
        Cart<String> cart = new Cart<>();
        cart.addItem("Book");
        cart.addItem("Pen");
        cart.showItems();
    }
}