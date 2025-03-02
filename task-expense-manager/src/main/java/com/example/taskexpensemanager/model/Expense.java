package com.example.taskexpensemanager.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String description;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private ExpenseCategory category; // FOOD, BILLS, TRANSPORTATION

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    // Constructor
    public Expense() {}

    public Expense(Double amount, String description, LocalDateTime date, ExpenseCategory category, User user) {
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.category = category;
        this.user = user;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public ExpenseCategory getCategory() { return category; }
    public void setCategory(ExpenseCategory category) { this.category = category; }
    
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
