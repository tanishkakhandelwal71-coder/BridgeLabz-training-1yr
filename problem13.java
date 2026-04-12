import java.util.*;

public class EmployeeMapping {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 1. Add multiple employees
        employeeMap.put(101, "Engineering");
        employeeMap.put(102, "HR");
        employeeMap.put(103, "Engineering");
        employeeMap.put(104, "Marketing");
        employeeMap.put(105, "HR");

        // 2. Change department of an employee (update value)
        employeeMap.put(102, "Marketing"); // Updates ID 102 from HR to Marketing

        // 3. Find all employees working in a given department (reverse lookup)
        String searchDept = "Engineering";
        System.out.println("Employees in " + searchDept + ":");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(searchDept)) {
                System.out.println("- ID: " + entry.getKey());
            }
        }

        // 4. Print total employees per department (grouping logic)
        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : employeeMap.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }
        System.out.println("\nTotal employees per department: " + deptCount);
    }
}