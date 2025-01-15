package by.tms.studentprogresstrackingservice.service;

import by.tms.studentprogresstrackingservice.entity.Course;
import by.tms.studentprogresstrackingservice.repository.CourseRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
private CourseRepository courseRepository;
    @Transactional
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}