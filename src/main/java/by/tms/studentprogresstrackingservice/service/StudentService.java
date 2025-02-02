package by.tms.studentprogresstrackingservice.service;

import by.tms.studentprogresstrackingservice.entity.Student;
import by.tms.studentprogresstrackingservice.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository;
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllAStudents() {
        return studentRepository.findAll();
    }
}
