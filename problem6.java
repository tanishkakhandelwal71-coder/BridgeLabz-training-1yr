import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();

        // 1. Initialize students
        String[] students = {"Aman", "Riya", "Karan", "Neha", "Rahul"};
        for (String s : students) {
            attendance.put(s, 0);
        }

        // 2. Simulate 15 days attendance
        String[][] days = {
            {"Aman", "Riya", "Karan"},
            {"Aman", "Neha"},
            {"Riya", "Rahul"},
            {"Aman", "Riya"},
            {"Karan", "Rahul"},
            {"Aman", "Neha"},
            {"Riya", "Rahul"},
            {"Aman", "Riya"},
            {"Karan", "Neha"},
            {"Rahul", "Aman"},
            {"Riya", "Neha"},
            {"Aman", "Karan"},
            {"Rahul", "Riya"},
            {"Neha", "Aman"},
            {"Riya", "Karan"}
        };

        for (String[] day : days) {
            for (String student : day) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        // 3. Print attendance
        System.out.println("Attendance:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. Students with attendance < 10
        System.out.println("\nLow Attendance (<10 days):");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < 10) {
                System.out.println(entry.getKey());
            }
        }
    }
}