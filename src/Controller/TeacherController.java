package Controller;

import Model.Student;
import Model.Teacher;
import Model.User;
import Servise.TeacherService;

import java.util.List;

public class TeacherController implements UserController{
    private TeacherService service = new TeacherService();

    @Override
    public <T extends User> User create(int id, String name, String lastName) {
        return service.createTeacher(id, name, lastName);
    }

    @Override
    public <T extends User> void update(User user, String name, String lastName) {
        service.updateTeacher(user, name, lastName);
    }

    @Override
    public <T extends User> void showAllUser() {
        service.showAllTeachers();
    }

    public void sendOnConsole(List<User> teachers) {
        service.sendInConsole(teachers);
    }


}
