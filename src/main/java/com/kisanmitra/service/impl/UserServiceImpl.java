package com.kisanmitra.service.impl;

import com.kisanmitra.models.User;
import com.kisanmitra.repositories.UserRepository;
import com.kisanmitra.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    public User saveUser(User user) {
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUserById(Integer id) {
        return repo.findById(id).orElse(null);
    }
}
