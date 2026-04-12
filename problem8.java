import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();

        // 1. Initial registration
        courses.put("CS101", 55);
        courses.put("MATH202", 4);
        courses.put("BIO105", 25);
        courses.put("ENG110", 2);
        courses.put("HIST200", 49);

        // 2. Add/Drop students
        updateCount(courses, "MATH202", 2); // Add 2
        updateCount(courses, "CS101", -10); // Drop 10

        // 3. Status report
        System.out.println("Near Full (>= 50):");
        courses.forEach((code, count) -> {
            if (count >= 50) System.out.println(code + ": " + count);
        });

        System.out.println("\nUnder-subscribed (< 5):");
        courses.forEach((code, count) -> {
            if (count < 5) System.out.println(code + ": " + count);
        });
    }

    public static void updateCount(Map<String, Integer> map, String code, int change) {
        if (map.containsKey(code)) {
            int newCount = Math.max(0, map.get(code) + change);
            map.put(code, newCount);
        }
    }
}