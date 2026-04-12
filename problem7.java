import java.util.*;

public class CountryLookup {
    public static void main(String[] args) {
        // Using TreeMap for automatic alphabetical ordering of keys
        Map<String, String> countryMap = new TreeMap<>();

        // 1. Add country-capital pairs
        countryMap.put("USA", "Washington D.C.");
        countryMap.put("India", "New Delhi");
        countryMap.put("France", "Paris");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Brazil", "Brasilia");
        countryMap.put("Egypt", "Cairo");
        countryMap.put("Canada", "Ottawa");
        countryMap.put("Germany", "Berlin");

        // 2. Lookup capital
        String search = "India";
        System.out.println("Search for " + search + ": " + countryMap.getOrDefault(search, "Unknown country"));

        // 3. Print all in alphabetical order
        System.out.println("\nFull Directory (Alphabetical):");
        for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}