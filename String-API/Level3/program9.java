import java.util.Scanner;

public class CalendarDisplay {

    // a. Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    // Check for Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // b. Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month];
    }

    // c. Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Algorithm variables: y0, x, m0, d0. d is 1 (first day).
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        // d0 is the day of the week (0=Sun, 1=Mon, ..., 6=Sat)
        return d0;
    }

    // d. Displaying the Calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int numDays = getDaysInMonth(month, year);

        // i. The first for loop up to the first day to get the proper indentation.
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%4s", ""); // Use 4 spaces for alignment
        }

        // ii. The Second for loop Displays the days of the month starting from 1
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day); // Use %3d for right-justified in width 3

            // Move to the next line after Sat (which is when (firstDay + day) % 7 == 0)
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}