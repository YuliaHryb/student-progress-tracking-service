package by.tms.studentprogresstrackingservice.repository;

import by.tms.studentprogresstrackingservice.entity.Account;
import by.tms.studentprogresstrackingservice.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Grade, Long> {
}
