package dnd_backend.dnd_backend.controller;

import dnd_backend.dnd_backend.model.User;
import dnd_backend.dnd_backend.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserDao userDao;

    @PostMapping("/user/registration")
    public User registration(@RequestBody User user) {
        this.userDao.userRegistration(user);
        return user;
    }

    @PostMapping("/user/login")
    public boolean login(@RequestBody User user) {
        return this.userDao.userLogin(user);
    }

    @GetMapping("/user/list")
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
