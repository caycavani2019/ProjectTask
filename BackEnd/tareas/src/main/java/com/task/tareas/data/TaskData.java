package com.task.tareas.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task.tareas.model.Task;
import com.task.tareas.repository.TaskRepository;

@Component
public class TaskData {

    @Autowired
    private TaskRepository taskRepository;

    // Método para obtener todas las tareas
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Método para obtener una tarea por ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Método para crear una nueva tarea
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Método para actualizar una tarea existente
    public Task updateTask(Long id, Task taskUpdated) {
        taskUpdated.setId(id);
        return taskRepository.save(taskUpdated);
    }

    // Método para eliminar una tarea por ID
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
