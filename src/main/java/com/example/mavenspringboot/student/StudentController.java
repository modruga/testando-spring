package com.example.mavenspringboot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// This annotation tells Spring that this class is a controller
// this is a class that handles incoming HTTP requests

@RestController

// This annotation tells Spring that this controller will handle requests that start with /api/v1/student
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // This annotation tells Spring that this method will handle GET requests
    @GetMapping

    // This method returns a list of students (using the Getter method in the Student class)
    public List<Student> getStudents() {

        // This uses the List.of() method to create a list of students,
        // "of" is a static method in the List interface that returns an
        // immutable list containing the specified elements
        return List.of(
                new Student (1L,
                        "Cassian",
                        "cassian@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 17),
                        24)
        );
    }

}
