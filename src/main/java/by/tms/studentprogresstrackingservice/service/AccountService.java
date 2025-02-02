package by.tms.studentprogresstrackingservice.service;

import by.tms.studentprogresstrackingservice.dto.AccountDto;
import by.tms.studentprogresstrackingservice.entity.Account;
import by.tms.studentprogresstrackingservice.entity.Student;
import by.tms.studentprogresstrackingservice.repository.AccountRepository;
import by.tms.studentprogresstrackingservice.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements UserDetailsService {
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
        student.setAccount(account);
        studentRepository.save(student);
    }

    public boolean checkUsernameExist(String username) {
        List<Account> account = accountRepository.findAll();
        for (Account a : account) {
            if (a.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return accountRepository.findByUsername(username).orElseThrow();
    }
}







