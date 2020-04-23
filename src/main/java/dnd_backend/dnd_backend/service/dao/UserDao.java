package dnd_backend.dnd_backend.service.dao;

import dnd_backend.dnd_backend.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void setUser(List<User> newUsers);

    boolean userLogin(User user);

    void userRegistration(User user);
}
