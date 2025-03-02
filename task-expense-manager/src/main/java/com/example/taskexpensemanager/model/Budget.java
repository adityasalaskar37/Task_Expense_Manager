package com.example.taskexpensemanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "budgets")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private ExpenseCategory category;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructor
    public Budget() {}

    public Budget(Double amount, ExpenseCategory category) {
        this.amount = amount;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public ExpenseCategory getCategory() { return category; }
    public void setCategory(ExpenseCategory category) { this.category = category; }
    
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
