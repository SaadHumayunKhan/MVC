package ModefiedExample.Model;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double calculateAverageCGPA() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double totalCGPA = 0.0;
        for (Student student : students) {
            totalCGPA += student.getCgpa();
        }
        return totalCGPA / students.size();
    }
}


