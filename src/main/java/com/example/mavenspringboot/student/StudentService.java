package com.example.mavenspringboot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// essa anotação diz ao Spring que essa classe é um serviço
@Service
public class StudentService {

    public List<Student> getStudents() {

        return List.of(
            new Student(
                1L,
                "Mariam",
                "miriam@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21)

        );

    }
}
