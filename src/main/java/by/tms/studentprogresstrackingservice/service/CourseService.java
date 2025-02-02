package by.tms.studentprogresstrackingservice.service;

import by.tms.studentprogresstrackingservice.entity.Course;
import by.tms.studentprogresstrackingservice.entity.Grade;
import by.tms.studentprogresstrackingservice.entity.Student;
import by.tms.studentprogresstrackingservice.repository.CourseRepository;
import by.tms.studentprogresstrackingservice.repository.GradeRepository;
import by.tms.studentprogresstrackingservice.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Course save(Course course, Long accountId, Long studentId) {
        Student student = studentRepository.findByAccountId(accountId);
        Course newCourse = courseRepository.save(course);
        Grade grade = new Grade();
        grade.setCourse(newCourse);
        grade.setStudent(student);
        gradeRepository.save(grade);
        return newCourse;
    }
}