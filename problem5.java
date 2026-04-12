import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        // Normalize: lowercase + remove punctuation
        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = sentence.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Print result
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}