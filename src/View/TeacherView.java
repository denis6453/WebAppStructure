package View;

import Model.Teacher;
import Model.User;

import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public <T extends User> void sendInConsole(List<User> users) {
        System.out.println(users);
    }
}
