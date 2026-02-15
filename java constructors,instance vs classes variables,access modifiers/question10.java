
public class Question10 {
    public static void main(String[] args) {
        // Question 10: University Management System
        PostgraduateStudent pgStudent = new PostgraduateStudent("Bob", 202, 8.5);
        pgStudent.displayDetails();
        pgStudent.updateCGPA(9.0);
        pgStudent.displayDetails();
    }
}

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(String name, int rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }

    public void updateCGPA(double newCGPA) {
        this.cgpa = newCGPA;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(String name, int rollNumber, double cgpa) {
        super(name, rollNumber, cgpa);
    }

    public void displayDetails() {
        // Accessing protected member 'name' directly
        System.out.println("PG Student: " + name + ", Roll: " + rollNumber + ", CGPA: " + getCGPA());
        // Cannot access 'cgpa' directly (private)
    }
}