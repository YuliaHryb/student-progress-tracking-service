package by.tms.studentprogresstrackingservice.repository;

import by.tms.studentprogresstrackingservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);

}
