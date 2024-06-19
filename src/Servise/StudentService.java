package Servise;

import Model.Student;
import Model.Teacher;
import Model.User;
import View.StudentView;
import View.UserView;

import java.util.Collections;
import java.util.List;

public class StudentService {

    private StudentView view = new StudentView();

    public Student createStudent(int id, String name, String lastName) {
        return new Student(id, name, lastName);
    }


    public void sendInConsole(List<User> students) {
        view.sendInConsole(students);
    }
}
