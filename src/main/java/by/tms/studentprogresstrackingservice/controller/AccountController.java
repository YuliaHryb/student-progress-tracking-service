package by.tms.studentprogresstrackingservice.controller;

import by.tms.studentprogresstrackingservice.dto.AccountDto;
import by.tms.studentprogresstrackingservice.entity.Grade;
import by.tms.studentprogresstrackingservice.entity.Student;
import by.tms.studentprogresstrackingservice.repository.StudentRepository;
import by.tms.studentprogresstrackingservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/account")  //localhost:8080/account
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/students")
    public String addStudent(@ModelAttribute AccountDto accountDto, Model model) {
        accountService.addAccount(accountDto);
        return "redirect:/students";
    }
    @GetMapping("/students")
    public String showStudents(Model model) {

        return "students";
    }
}


