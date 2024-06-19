package View;

import Model.User;

import java.util.List;

public interface UserView <T extends User>{

    <T extends User> void sendInConsole(List<User> users);
}
