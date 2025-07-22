package service;

import entity.User;
import entity.UserModel;
import org.springframework.stereotype.Service;

public interface UserService {

    User createUser(UserModel user);

    User readUser();

    User updateUser(UserModel user);

    void deleteUser();

    User getLoggedInUser();
}