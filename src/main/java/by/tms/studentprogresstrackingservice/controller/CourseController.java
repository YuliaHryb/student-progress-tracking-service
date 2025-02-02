package by.tms.studentprogresstrackingservice.controller;

import by.tms.studentprogresstrackingservice.entity.Course;
import by.tms.studentprogresstrackingservice.repository.CourseRepository;
import by.tms.studentprogresstrackingservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;
    public CourseRepository repo;

    @PostMapping("/courses")
    public String addCourse(@ModelAttribute Course course, Long studentId) {
        courseService.save(course, studentId);
        return "redirect:/courses";
    }
}

