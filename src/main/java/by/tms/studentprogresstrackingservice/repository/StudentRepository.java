package by.tms.studentprogresstrackingservice.repository;

import by.tms.studentprogresstrackingservice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByAccountId(Long accountId);
}
