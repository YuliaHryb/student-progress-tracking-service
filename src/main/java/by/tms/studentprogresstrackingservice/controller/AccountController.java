package by.tms.studentprogresstrackingservice.controller;

import by.tms.studentprogresstrackingservice.dto.AccountDto;
import by.tms.studentprogresstrackingservice.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")  //localhost:8080/account
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/login")
    public String login(@ModelAttribute("newAccount") AccountDto accountDto) {
        return "login";
    }

    @GetMapping("/reg")
    public String register(@ModelAttribute("newAccount") AccountDto accountDto) {
        return "registration";
    }

    @PostMapping("/reg")
    public String login(@ModelAttribute("newAccount") @Valid AccountDto accountDto, BindingResult bindingResult, Model model) {
        model.addAttribute("WrongLoginOrPassword", false);
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        accountService.addAccount(accountDto);
        return "redirect:/";
    }

    @PostMapping("/students")
    public String addStudent(AccountDto accountDto, Model model) {
        accountService.addAccount(accountDto);
        return "redirect:/students";
    }
    @GetMapping("/students")
    public String showStudents(Model model) {
        return "students";
    }
}


