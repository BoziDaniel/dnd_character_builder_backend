package dnd_backend.dnd_backend.service.dao.implementation;

import dnd_backend.dnd_backend.model.User;
import dnd_backend.dnd_backend.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("userService")
public class UserDaoMem implements UserDao {

    private List<User> users = new ArrayList<>();


    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public void setUser(List<User> newUsers) {

    }

    @Override
    public void add(User user) {

    }
}
