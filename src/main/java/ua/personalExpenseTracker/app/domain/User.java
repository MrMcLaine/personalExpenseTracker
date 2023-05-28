package ua.personalExpenseTracker.app.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User extends AbstractBaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthday;
}
