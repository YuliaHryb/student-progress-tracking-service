package by.tms.studentprogresstrackingservice.service;

import by.tms.studentprogresstrackingservice.entity.Grade;
import by.tms.studentprogresstrackingservice.repository.GradeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    private GradeRepository gradeRepository;

    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }
    @Transactional
    public Grade addGrade(Grade grade) {
        return gradeRepository.save(grade);

    }
}
