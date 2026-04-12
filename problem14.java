import java.util.*;

// Base class
abstract class CourseType {
    String name;

    CourseType(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

// Subclasses
class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }
}

// Generic class
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }

    List<T> getCourses() {
        return courses;
    }
}

// Wildcard method
class University {
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType c : list) {
            c.display();
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math Exam"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Java Assignment"));

        displayCourses(examCourses.getCourses());
        displayCourses(assignmentCourses.getCourses());
    }
}