package com.huskyhehe.studentbackend.service;

import com.huskyhehe.studentbackend.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Huskyhehe",
                        "huskyhehe@gmail.com",
                        21,
                        LocalDate.of(2000, Month.MAY, 30)
                )
        );
    }
}
