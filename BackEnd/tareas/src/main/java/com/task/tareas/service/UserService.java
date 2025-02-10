package com.task.tareas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.tareas.model.Role;
import com.task.tareas.model.Users;
import com.task.tareas.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Users> getUsersByRole(Role role) {
        return userRepository.findByRole(role);
    }
}
