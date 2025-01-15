package by.tms.studentprogresstrackingservice.repository;

import by.tms.studentprogresstrackingservice.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}
