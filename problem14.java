import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        // Map<Subject, Map<StudentName, Marks>>
        Map<String, Map<String, Integer>> examData = new HashMap<>();

        // 1. Add multiple subjects and marks
        addScore(examData, "Java", "Alice", 85);
        addScore(examData, "Java", "Bob", 92);
        addScore(examData, "Python", "Alice", 95);
        addScore(examData, "Python", "Charlie", 88);

        // 2 & 3. Top scorer and Average score per subject
        for (String subject : examData.keySet()) {
            Map<String, Integer> students = examData.get(subject);
            String topper = "";
            int maxScore = -1;
            double sum = 0;

            for (Map.Entry<String, Integer> entry : students.entrySet()) {
                sum += entry.getValue();
                if (entry.getValue() > maxScore) {
                    maxScore = entry.getValue();
                    topper = entry.getKey();
                }
            }

            System.out.println("Subject: " + subject);
            System.out.println(" - Topper: " + topper + " (" + maxScore + ")");
            System.out.println(" - Average: " + (sum / students.size()));
        }

        // 4. List subjects where at least one student scored above 90
        System.out.print("\nSubjects with scores > 90: ");
        for (var entry : examData.entrySet()) {
            for (int score : entry.getValue().values()) {
                if (score > 90) {
                    System.out.print(entry.getKey() + " ");
                    break; 
                }
            }
        }
    }

    // Helper method to populate the nested map
    private static void addScore(Map<String, Map<String, Integer>> map, String sub, String name, int mark) {
        map.putIfAbsent(sub, new HashMap<>());
        map.get(sub).put(name, mark);
    }
}