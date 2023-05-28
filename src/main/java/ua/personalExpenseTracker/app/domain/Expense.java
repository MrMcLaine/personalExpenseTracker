package ua.personalExpenseTracker.app.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Expense extends AbstractBaseEntity{
    private TypeOfExpense type;
    private String name;
    private Double price;
    private LocalDate date;
    private String description;
}
