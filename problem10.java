import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        // 1. Initialize Map: Key = Page Name, Value = Visit Count
        Map<String, Integer> visitTracker = new HashMap<>();

        // Simulated user visiting pages
        String[] visitedPages = {"home", "about", "products", "home", "products", "contact", "home"};

        // 2. Operation: Update counts
        for (String page : visitedPages) {
            visitTracker.put(page, visitTracker.getOrDefault(page, 0) + 1);
        }

        // 3. Sort by descending visit count
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(visitTracker.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Output Results
        System.out.println("--- Session Report (Sorted by Visits) ---");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println("Page: " + entry.getKey() + " | Visits: " + entry.getValue());
        }

        // 4. Print the page with the most visits
        if (!sortedList.isEmpty()) {
            System.out.println("\nMost Visited Page: " + sortedList.get(0).getKey());
        }
    }
}