package com.example.taskexpensemanager.repository;

import com.example.taskexpensemanager.model.TaskExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskExpenseRepository extends JpaRepository<TaskExpense, Long> {
}
