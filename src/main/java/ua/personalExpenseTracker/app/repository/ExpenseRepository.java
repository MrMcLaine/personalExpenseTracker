package ua.personalExpenseTracker.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.personalExpenseTracker.app.domain.Expense;

public interface ExpenseRepository extends JpaRepository<Integer, Expense> {
}
