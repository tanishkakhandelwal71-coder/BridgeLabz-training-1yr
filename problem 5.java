class Fruit {
    void show() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit {
    void show() {
        System.out.println("Apple");
    }
}

class Mango extends Fruit {
    void show() {
        System.out.println("Mango");
    }
}

class FruitBox<T extends Fruit> {
    private T fruit;

    void add(T fruit) {
        this.fruit = fruit;
    }

    void display() {
        fruit.show();
    }
}

class TestFruit {
    public static void main(String[] args) {
        FruitBox<Apple> box1 = new FruitBox<>();
        box1.add(new Apple());
        box1.display();

        FruitBox<Mango> box2 = new FruitBox<>();
        box2.add(new Mango());
        box2.display();

        // FruitBox<String> box3 = new FruitBox<>(); ❌ Compile-time error
    }
}