package ua.personalExpenseTracker.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.personalExpenseTracker.app.domain.FinancialPlan;

public interface FinancialPlanRepository extends JpaRepository<Integer, FinancialPlan> {
}
