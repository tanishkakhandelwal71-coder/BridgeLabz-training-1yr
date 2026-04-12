import java.util.*;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> employees = new HashMap<>();

        // 1. Add employees
        employees.put("Alice", 50000.0);
        employees.put("Bob", 60000.0);
        employees.put("Charlie", 60000.0);
        employees.put("Diana", 45000.0);

        // 2. Give a raise (e.g., 10%)
        String name = "Alice";
        if (employees.containsKey(name)) {
            employees.put(name, employees.get(name) * 1.10);
        } else {
            System.out.println("Employee not found");
        }

        // 3. Print average salary
        double sum = 0;
        for (double salary : employees.values()) sum += salary;
        System.out.println("Average Salary: " + (sum / employees.size()));

        // 4. Print highest-paid employee(s)
        double maxSalary = Collections.max(employees.values());
        System.out.print("Highest Paid: ");
        employees.forEach((k, v) -> {
            if (v == maxSalary) System.out.print(k + " ");
        });
    }
}