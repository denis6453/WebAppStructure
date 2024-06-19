package Servise;

import Model.Student;
import Model.Teacher;
import Model.User;
import View.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<User> teachers = new ArrayList<>();

    private TeacherView view = new TeacherView();

    public Teacher createTeacher(int id, String name, String lastName) {
        Teacher teacher = new Teacher(id, name, lastName);
        teachers.add(teacher);
        return new Teacher(id, name, lastName);
    }

    public void updateTeacher(User user, String name, String lastName) {
        int index = teachers.indexOf(user);

        if (index != -1) {
            user.setName(name);
            user.setLastName(lastName);
            teachers.set(index, user);
        }
        else {
            System.out.println("Такого учителя не существует");
        }
    }


    public void showAllTeachers () {
        view.sendInConsole(teachers);
    }


    public void sendInConsole(List<User> teachers) {
        view.sendInConsole(teachers);
    }

}
