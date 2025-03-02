package com.example.taskexpensemanager.controller;

import com.example.taskexpensemanager.model.Budget;
import com.example.taskexpensemanager.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

	@Autowired
    private BudgetService budgetService;

    @PostMapping
    public ResponseEntity<Budget> addBudget(@RequestBody Budget budget) {
        return ResponseEntity.ok(budgetService.addBudget(budget));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Budget> getBudgetById(@PathVariable Long id) {
        return ResponseEntity.ok(budgetService.getBudgetById(id));
    }

    @GetMapping
    public ResponseEntity<List<Budget>> getAllBudgets() {
        return ResponseEntity.ok(budgetService.getAllBudgets());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Budget> updateBudget(@PathVariable Long id, @RequestBody Budget updatedBudget) {
        updatedBudget.setId(id);
        return ResponseEntity.ok(budgetService.updateBudget(updatedBudget));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
        return ResponseEntity.ok("Budget deleted successfully");
    }
}
