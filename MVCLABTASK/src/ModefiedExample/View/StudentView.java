package ModefiedExample.View;

// import java.util.List;

public class StudentView {
    public void printStudentDetails(String name, String id, double cgpa) {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student CGPA: " + cgpa);
    }

    public void printAverageCGPA(double average) {
        System.out.println("Average CGPA: " + average);
    }
}
