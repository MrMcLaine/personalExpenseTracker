package ua.personalExpenseTracker.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.personalExpenseTracker.app.domain.User;

public interface UserRepository extends JpaRepository<Integer, User> {
}
