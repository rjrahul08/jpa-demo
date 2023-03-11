package com.jpatutorial.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);
        return  "USER ADDED";
    }

    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "Deleted";
    }


    public String  deleteAllUsers() {
        userRepository.deleteAll();
        return "All User Deleted";
    }
}
