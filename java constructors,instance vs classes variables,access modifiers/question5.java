
public class Question5 {
    public static void main(String[] args) {
        // Question 5: Library Book System
        LibraryBook book = new LibraryBook("1984", "George Orwell", 15.0);
        book.displayDetails();
        book.borrowBook();
        book.borrowBook(); // Already borrowed
    }
}

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // Available by default
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }

    public void displayDetails() {
        System.out.println("Book: " + title + " by " + author + ", Price: $" + price + ", Available: " + availability);
    }
}