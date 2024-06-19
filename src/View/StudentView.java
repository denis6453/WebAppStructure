package View;

import Model.Student;
import Model.User;

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public <T extends User> void sendInConsole(List<User> users) {
        System.out.println(users);
    }
}
