package by.tms.studentprogresstrackingservice.service;

import by.tms.studentprogresstrackingservice.dto.AccountDto;
import by.tms.studentprogresstrackingservice.entity.Account;
import by.tms.studentprogresstrackingservice.entity.Grade;
import by.tms.studentprogresstrackingservice.entity.Student;
import by.tms.studentprogresstrackingservice.repository.AccountRepository;
import by.tms.studentprogresstrackingservice.repository.GradeRepository;
import by.tms.studentprogresstrackingservice.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Transactional
    public void addAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setUsername(accountDto.getUsername());
        account.setPassword(accountDto.getPassword());
        accountRepository.save(account);
        Student student = new Student();
        student.setFirstName(accountDto.getFirstName());
        student.setLastName(accountDto.getLastName());
        student.setAccount(account);
        studentRepository.save(student);
    }
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    }






