package com.huskyhehe.studentbackend;

import com.huskyhehe.studentbackend.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class StudentBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentBackendApplication.class, args);
	}

	@GetMapping
	public List<Student> printStudents() {
		return List.of(
				new Student(
						1L,
						"Maria",
						"maria@gmail.com",
						21,
						LocalDate.of(2000, Month.MAY, 30)
				)
		);
	}

}
