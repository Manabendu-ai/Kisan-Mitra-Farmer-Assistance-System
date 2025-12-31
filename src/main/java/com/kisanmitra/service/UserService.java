package com.kisanmitra.service;

import com.kisanmitra.models.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Integer id);
}