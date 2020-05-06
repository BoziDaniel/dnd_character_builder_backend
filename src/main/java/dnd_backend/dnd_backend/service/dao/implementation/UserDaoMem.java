package dnd_backend.dnd_backend.service.dao.implementation;

import dnd_backend.dnd_backend.model.User;
import dnd_backend.dnd_backend.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Qualifier("userService")
public class UserDaoMem implements UserDao {

    private List<User> users = new ArrayList<>();


    @Override
    public List<User> getUsers() {
        users.add(new User("roland@gmail.com", "admin", "admin", "admin"));
        return users;
    }

    @Override
    public void setUser(List<User> newUsers) {
        this.users = newUsers;


    }

    @Override
    public void userRegistration(User user) {
        users.add(user);
        System.out.println("lö users:");
        for (User userr : users) {
            System.out.println(userr.toString());
        }

    }
}
