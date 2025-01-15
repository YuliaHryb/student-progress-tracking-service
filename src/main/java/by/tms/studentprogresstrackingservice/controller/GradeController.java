package by.tms.studentprogresstrackingservice.controller;

import by.tms.studentprogresstrackingservice.entity.Course;
import by.tms.studentprogresstrackingservice.entity.Grade;
import by.tms.studentprogresstrackingservice.service.AccountService;
import by.tms.studentprogresstrackingservice.service.GradeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/grade")
public class GradeController  {
    private GradeService gradeService;
    private AccountService accountService;
    @PostMapping("/grade")
    public String addGrade (@ModelAttribute Course course) {

}

}