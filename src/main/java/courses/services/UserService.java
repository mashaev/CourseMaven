package courses.services;

import courses.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    void saveUser(User user);
}
