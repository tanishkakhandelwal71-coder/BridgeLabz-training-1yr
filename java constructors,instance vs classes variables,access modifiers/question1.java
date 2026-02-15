
public class Question1 {
    public static void main(String[] args) {
        // Question 1: Book Class with default and parameterized constructors
        Book book1 = new Book();
        book1.displayDetails();
        
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book2.displayDetails();
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("Default Book created.");
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized Book created.");
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}