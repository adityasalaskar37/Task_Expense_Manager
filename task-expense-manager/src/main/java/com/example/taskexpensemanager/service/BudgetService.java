package com.example.taskexpensemanager.service;

import com.example.taskexpensemanager.model.Budget;
import com.example.taskexpensemanager.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BudgetService {

	@Autowired
    private BudgetRepository budgetRepository;

    public Budget addBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Budget getBudgetById(Long id) {
        return budgetRepository.findById(id).orElse(null);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }
    
    public Budget updateBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }
}
