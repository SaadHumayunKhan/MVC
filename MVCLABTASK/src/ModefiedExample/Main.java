package ModefiedExample;

import ModefiedExample.Controller.StudentController;
import ModefiedExample.Model.StudentModel;
import ModefiedExample.View.StudentView;

public class Main {
    public static void main(String[] args) {
       
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

       
        controller.addStudent("Saad", "Fa22-bse-012", 3.8);
        controller.addStudent("Humayun", "Fa22-bse-013", 3.5);
        controller.addStudent("Khan", "Fa22-bse-014", 3.9);

        
        System.out.println("Student Details:");
        controller.displayStudents();

        
        System.out.println("\nAverage CGPA:");
        controller.displayAverageCGPA();
    }
}
