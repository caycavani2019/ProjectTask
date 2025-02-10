package com.task.tareas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.tareas.model.Task;
import com.task.tareas.model.TaskStatus;
import com.task.tareas.model.Users;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByAssignedUser(Users assignedUser);
}
