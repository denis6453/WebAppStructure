import Controller.StudentController;
import Controller.TeacherController;
import Model.Student;
import Model.Teacher;
import Model.User;

import java.util.List;

/**
 * program
 */
public class Main {
    static public void main (String[] args) {

        StudentController studentController = new StudentController();

        User student1 = studentController.create(1, "Иванs", "Иванова");

        User student2 = studentController.create(2, "Иван", "Иванов");

        studentController.sendOnConsole(List.of(student1, student2));

        TeacherController teacherController = new TeacherController();

        User teacher1 = teacherController.create(1, "Геннадий", "Иванова");
        User teacher2 = teacherController.create(2, "Пётр", "Иванова");

        teacherController.showAllUser();

        teacherController.update(teacher1, "Борис", "Иванов");

        teacherController.showAllUser();

    }
}