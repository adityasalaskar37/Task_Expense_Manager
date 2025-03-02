package com.example.taskexpensemanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "task_expenses")
public class TaskExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Task task;

    @ManyToOne
    private Expense expense;

    // Constructor
    public TaskExpense() {}

    public TaskExpense(Task task, Expense expense) {
        this.task = task;
        this.expense = expense;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Task getTask() { return task; }
    public void setTask(Task task) { this.task = task; }

    public Expense getExpense() { return expense; }
    public void setExpense(Expense expense) { this.expense = expense; }
}
