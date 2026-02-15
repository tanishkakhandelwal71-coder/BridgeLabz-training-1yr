
public class Question2 {
    public static void main(String[] args) {
        // Question 2: Circle Class with constructor chaining
        Circle c1 = new Circle(); // Uses default
        c1.display();
        
        Circle c2 = new Circle(5.5); // Uses parameterized
        c2.display();
    }
}

class Circle {
    private double radius;

    // Default constructor calling parameterized constructor
    public Circle() {
        this(1.0); // Default radius 1.0
        System.out.println("Default constructor called.");
    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Parameterized constructor called.");
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}