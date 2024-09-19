package com.example.mavenspringboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// essa anotação diz ao Spring que essa classe é um controlador
@RestController

// essa anotação define o caminho base para todas as solicitações neste controlador para "/api/v1/student"
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // essa anotação diz ao Spring para injetar uma instância de StudentService aqui
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



        // essa anotação diz ao spring que esse method deve ser chamado quando
        // uma solicitação GET é feita para "/api/v1/student"
        @GetMapping

        // esse method retorna uma lista de estudantes
        public List<Student> getStudents () {

            // usando o method getStudents() em StudentService para obter a lista de estudantes

            return studentService.getStudents();

        }

}

