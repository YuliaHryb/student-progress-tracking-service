package by.tms.studentprogresstrackingservice.service;

import by.tms.studentprogresstrackingservice.entity.Student;
import by.tms.studentprogresstrackingservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    private StudentRepository studentRepository;
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}
