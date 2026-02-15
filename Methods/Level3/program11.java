import java.util.Random;

public class EmployeeBonus {

    // Method to generate salary and years of service
    public static int[][] generateData() {
        Random rand = new Random();
        int[][] data = new int[10][2]; // [salary, years]

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + rand.nextInt(10); // years between 1-10
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][3]; // old salary, bonus, new salary

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    // Method to display summary
    public static void display(double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Old Salary\tBonus\tNew Salary");

        for (int i = 0; i < 10; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1] + "\t" + result[i][2]);
            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {
        int[][] data = generateData();
        double[][] result = calculateBonus(data);
        display(result);
    }
}