package com.task.tareas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.tareas.model.Role;
import com.task.tareas.model.Users;


public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findByRole(Role role);
}
