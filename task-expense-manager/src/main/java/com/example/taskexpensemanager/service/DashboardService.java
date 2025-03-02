package com.example.taskexpensemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskexpensemanager.model.Expense;
import com.example.taskexpensemanager.model.Task;
import com.example.taskexpensemanager.repository.ExpenseRepository;
import com.example.taskexpensemanager.repository.TaskRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DashboardService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private TaskRepository taskRepository;

    public Map<String, Object> getDashboardData(Long userId) {
        Map<String, Object> dashboardData = new HashMap<>();

        // Get total expenses
        List<Expense> expenses = expenseRepository.findByUserId(userId);
        double totalExpenses = expenses.stream().mapToDouble(Expense::getAmount).sum();
        dashboardData.put("totalExpenses", totalExpenses);

        // Get total tasks and completion rate
        List<Task> tasks = taskRepository.findByUserId(userId);
        long completedTasks = tasks.stream().filter(Task::isCompleted).count();
        dashboardData.put("totalTasks", tasks.size());
        dashboardData.put("completedTasks", completedTasks);
        dashboardData.put("taskCompletionRate", tasks.isEmpty() ? 0 : (completedTasks * 100.0 / tasks.size()));

        return dashboardData;
    }
}
