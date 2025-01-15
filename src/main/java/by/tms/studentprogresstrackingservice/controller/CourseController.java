package by.tms.studentprogresstrackingservice.controller;

import by.tms.studentprogresstrackingservice.entity.Course;
import by.tms.studentprogresstrackingservice.entity.Student;
import by.tms.studentprogresstrackingservice.repository.CourseRepository;
import by.tms.studentprogresstrackingservice.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")
public class CourseController {
    public CourseRepository repo;

    @PostMapping("/courses")
    public String addCourse(@ModelAttribute Course course) {
        CourseService service = new CourseService();
        return "redirect:/courses";
    }
}

