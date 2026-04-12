import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

class WarehouseTest {
    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            item.display();
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("TV"));
        electronics.addItem(new Electronics("Phone"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));

        displayAll(electronics.getItems());
        displayAll(groceries.getItems());
    }
}