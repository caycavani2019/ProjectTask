package com.task.tareas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.task.tareas.model.Task;
import com.task.tareas.model.TaskStatus;
import com.task.tareas.repository.TaskRepository;

public class TaskServiceTest {

    @InjectMocks
    private TaskService taskService;

    @Mock
    private TaskRepository taskRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveTask() {
        Task task = new Task("Test Task", null, TaskStatus.PENDIENTE);
        when(taskRepository.save(task)).thenReturn(task);

        Task savedTask = taskService.createTask(task);
        assertEquals("Test Task", savedTask.getDescription());
    }
}
