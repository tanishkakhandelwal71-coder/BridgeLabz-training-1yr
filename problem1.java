import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>(); // sorted automatically

        // 1. Add students
        grades.put("Riya", 85.5);
        grades.put("Aman", 90.0);
        grades.put("Karan", 72.3);

        // 2. Update grade
        grades.put("Riya", 88.0); // updated

        // 3. Remove student
        grades.remove("Karan");

        // 4. Print sorted list
        System.out.println("Student Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}