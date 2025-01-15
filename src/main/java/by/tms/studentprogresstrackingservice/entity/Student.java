package by.tms.studentprogresstrackingservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.List;

@Entity
@Data
@ToString
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    @OneToOne
    private Account account;
}