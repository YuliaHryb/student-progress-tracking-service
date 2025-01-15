package by.tms.studentprogresstrackingservice.entity;

import jakarta.persistence.*;

@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;
    private Double grade;
}
