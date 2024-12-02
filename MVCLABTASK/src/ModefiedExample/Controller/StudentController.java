package ModefiedExample.Controller;

import ModefiedExample.View.StudentView;
import ModefiedExample.Model.StudentModel;
import ModefiedExample.Model.Student; 

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void addStudent(String name, String id, double cgpa) {
        Student student = new Student(name, id, cgpa);
        model.addStudent(student);
    }

    public void displayStudents() {
        for (Student student : model.getStudents()) {
            view.printStudentDetails(student.getName(), student.getId(), student.getCgpa());
        }
    }

    public void displayAverageCGPA() {
        double average = model.calculateAverageCGPA();
        view.printAverageCGPA(average);
    }
}
