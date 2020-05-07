package dnd_backend.dnd_backend.handler;

import dnd_backend.dnd_backend.model.Login;
import dnd_backend.dnd_backend.model.User;
import dnd_backend.dnd_backend.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class LoginHandler {

    @Autowired
    @Qualifier("userService")
    private UserDao userDao;

    public User handleLogin(Login login) {
        String userName = login.getUsername();
        String password = login.getPassword();
        List<User> users = userDao.getUsers();

        User foundUser = users.stream()
                .filter(userInMem -> userInMem.getUserName().equals(userName)&&userInMem.getPassword().equals(password))
                .findFirst().orElse(null);

        return foundUser;
    }
}
