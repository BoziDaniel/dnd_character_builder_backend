package dnd_backend.dnd_backend.controller;

import dnd_backend.dnd_backend.handler.LoginHandler;
import dnd_backend.dnd_backend.model.Login;
import dnd_backend.dnd_backend.model.User;
import dnd_backend.dnd_backend.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserDao userDao;

    @Autowired
    private LoginHandler loginHandler;

    @PostMapping("/user/registration")
    public User registration(@RequestBody User user) {
        this.userDao.userRegistration(user);
        return user;
    }

    @PostMapping("/user/login")
    public User login(@RequestBody Login login) {
        return this.loginHandler.handleLogin(login);
    }

/*    @GetMapping("/user/list")
    public List<User> getUsers() {
        return userDao.getUsers();
    }*/
}
