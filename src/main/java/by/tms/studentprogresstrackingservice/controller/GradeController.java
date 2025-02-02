package by.tms.studentprogresstrackingservice.controller;

import by.tms.studentprogresstrackingservice.entity.Course;
import by.tms.studentprogresstrackingservice.entity.Grade;
import by.tms.studentprogresstrackingservice.service.AccountService;
import by.tms.studentprogresstrackingservice.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grade")
public class GradeController  {
    private GradeService gradeService;
    private AccountService accountService;
    @PostMapping("/grade")
    public Grade addGrade(@ModelAttribute Course course) {
        Grade grade = new Grade();
        grade.setCourse(course);
        return grade;
    }

}