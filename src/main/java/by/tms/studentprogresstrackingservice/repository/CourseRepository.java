package by.tms.studentprogresstrackingservice.repository;


import by.tms.studentprogresstrackingservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
