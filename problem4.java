import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        // TreeMap → sorted by ISBN automatically
        Map<String, String> books = new TreeMap<>();

        // 1. Add books
        books.put("978-1111", "Java Basics");
        books.put("978-2222", "Data Structures");
        books.put("978-3333", "Operating Systems");

        // 2. Search by ISBN
        String isbn = "978-2222";
        if (books.containsKey(isbn)) {
            System.out.println("Found: " + books.get(isbn));
        } else {
            System.out.println("Book not found");
        }

        // 3. Remove book
        books.remove("978-1111");

        // 4. Print all books sorted by ISBN
        System.out.println("\nAll Books:");
        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 5. Search by title
        String searchTitle = "Data Structures";
        boolean found = false;
        for (Map.Entry<String, String> entry : books.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("Title found with ISBN: " + entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Title not found");
        }
    }
}