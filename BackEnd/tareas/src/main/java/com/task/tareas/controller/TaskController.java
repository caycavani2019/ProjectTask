package com.task.tareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.task.tareas.model.Task;
import com.task.tareas.model.TaskStatus;
import com.task.tareas.model.Users;
import com.task.tareas.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}/status")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody TaskStatus status) {
        return taskService.updateTaskStatus(id, status);
    }

    @GetMapping
    public List<Task> getTasks(@RequestParam(required = false) TaskStatus status, @RequestParam(required = false) Long userId) {
        if (status != null) {
            return taskService.getTasksByStatus(status);
        } else if (userId != null) {
            Users user = new Users();
            user.setId(userId);
            return taskService.getTasksByUser(user);
        }
        return taskService.getAllTasks(); 
    }
}
