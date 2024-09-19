package com.example.mavenspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenSpringBootApplication.class, args);
    }

}
