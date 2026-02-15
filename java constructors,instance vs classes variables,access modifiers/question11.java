
public class Question11 {
    public static void main(String[] args) {
        // Question 11: Book Library System
        EBook ebook = new EBook("Java Guide", "James Gosling", "123456789");
        ebook.displayInfo();
    }
}

class LibBook {
    public String isbn;
    protected String title;
    private String author;

    public LibBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends LibBook {
    public EBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    public void displayInfo() {
        // Accessing public 'isbn' and protected 'title'
        System.out.println("EBook: " + title + " (ISBN: " + isbn + ")");
        System.out.println("Author: " + getAuthor()); // Accessing private via getter
    }
}