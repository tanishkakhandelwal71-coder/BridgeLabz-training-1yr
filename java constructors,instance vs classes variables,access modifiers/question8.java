
public class Question8 {
    public static void main(String[] args) {
        // Question 8: Online Course Management
        Course c1 = new Course("Java Programming", 4, 100);
        Course c2 = new Course("Python Basics", 3, 80);
        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        
        Course.updateInstituteName("Tech Academy"); // Change for all
        System.out.println("\nAfter updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

class Course {
    private String courseName;
    private int duration; // months
    private double fee;
    private static String instituteName = "CodinClub"; // Default

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName + ", Course: " + courseName + 
                           ", Duration: " + duration + " months, Fee: $" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}