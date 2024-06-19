package Controller;

import Model.User;

import java.util.List;

public interface UserController {
    <T extends User> User  create(int id, String name, String lastName);

    <T extends User> void update(User user, String name, String lastName);

    <T extends User> void showAllUser();
}
