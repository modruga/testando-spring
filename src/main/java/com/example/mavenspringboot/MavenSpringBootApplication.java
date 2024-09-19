package com.example.mavenspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.mavenspringboot", "com.example.mavenspringboot.student"})
@RestController
public class MavenSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenSpringBootApplication.class, args);
    }

}
