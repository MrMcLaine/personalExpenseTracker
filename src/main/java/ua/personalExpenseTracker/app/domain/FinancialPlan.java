package ua.personalExpenseTracker.app.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class FinancialPlan extends AbstractBaseEntity{
    private Month month;
    private Double salaryPerMonth;
    private Map<TypeOfExpense, Double> limitsForExpenses;
    private Double moneyToSave;
    private String description;
}
