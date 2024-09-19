package com.example.mavenspringboot.student;

import java.time.LocalDate;

// essa classe representa um estudante,
// cada estudante tem um id, nome, email, data de nascimento e idade.
// nela há um construtor que inicializa todos os campos,
// também tem getters e setters para todos os campos para que possamos acessá-los e modificá-los
// ela tem um method toString que retorna uma representação em string do objeto
public class Student {

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
