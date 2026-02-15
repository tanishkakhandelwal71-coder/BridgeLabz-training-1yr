
public class Question3 {
    public static void main(String[] args) {
        // Question 3: Person Class with copy constructor
        Person p1 = new Person("Alice", 25);
        p1.display();
        
        Person p2 = new Person(p1); // Copying p1
        p2.display();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy constructor called.");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}