package Controller;

import Model.Student;
import Model.User;
import Servise.StudentService;
import View.StudentView;
import View.UserView;

import java.util.List;

public class StudentController implements UserController {

    private StudentService service = new StudentService();

    @Override
    public <T extends User> User create(int id, String name, String lastName) {
        return service.createStudent(id, name, lastName);
    }

    @Override
    public <T extends User> void update(User user, String name, String lastName) {

    }

    @Override
    public <T extends User> void showAllUser() {
    }


    public <T extends User> void sendOnConsole(List<User> users) {
        service.sendInConsole(users);
    }
}
