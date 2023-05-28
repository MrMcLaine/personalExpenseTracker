package ua.personalExpenseTracker.app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractBaseEntity {
    protected Integer id;
}

