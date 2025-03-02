package com.example.taskexpensemanager.repository;

import com.example.taskexpensemanager.model.Budget;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
	List<Budget> findByUserId(Long userId);
}
