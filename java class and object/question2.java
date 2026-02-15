
public class Question2 {
    public static void main(String[] args) {
        // Question 2: Area of Circle
        Circle circle = new Circle(5.0);
        circle.displayArea();
        circle.displayCircumference();
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area: %.2f%n", area);
    }

    public void displayCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference: %.2f%n", circumference);
    }
}