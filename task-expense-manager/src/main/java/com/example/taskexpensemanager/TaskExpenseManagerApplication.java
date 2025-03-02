package com.example.taskexpensemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskExpenseManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskExpenseManagerApplication.class, args);
        System.out.println("Task & Expense Manager Application is running...");
    }
}
