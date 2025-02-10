package com.task.tareas.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.task.tareas.model.Task;
import com.task.tareas.model.TaskStatus;
import com.task.tareas.service.TaskService;

@WebMvcTest(TaskController.class)
@SpringJUnitConfig
public class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    @SuppressWarnings("unused")
    private TaskService taskService;

    @Test
    public void testGetAllTasks() throws Exception {
        // Crea una tarea de ejemplo
        @SuppressWarnings("unused")
        Task task = new Task("Test Task", null, TaskStatus.PENDIENTE);
        
        // Simula el comportamiento del servicio
      //  when(((Object) taskService).findAll()).thenReturn(Collections.singletonList(task));

        // Realiza la solicitud y verifica la respuesta
        mockMvc.perform(get("/tasks"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].description").value("Test Task"));
    }
}
