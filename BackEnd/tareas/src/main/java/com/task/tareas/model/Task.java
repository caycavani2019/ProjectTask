package com.task.tareas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne
    private Users assignedUser;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public Task() {}

    public Task(String description, Users assignedUser, TaskStatus status) {
        this.description = description;
        this.assignedUser = assignedUser;
        this.status = status;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Users getAssignedUser() { return assignedUser; }
    public void setAssignedUser(Users assignedUser) { this.assignedUser = assignedUser; }
    public TaskStatus getStatus() { return status; }
    public void setStatus(TaskStatus status) { this.status = status; }
}
