package com.example.mavenspringboot.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table

// essa classe representa um estudante,
// cada estudante tem um id, nome, email, data de nascimento e idade.
// nela há um construtor que inicializa todos os campos,
// também tem getters e setters para todos os campos para que possamos acessá-los e modificá-los
// ela tem um method toString que retorna uma representação em string do objeto
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   Integer age) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;

    }

    public Student() {

    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
