package com.example.avaliacao4;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@EntityScan(basePackages = {
        "com.example.avaliacao4.model"
})
@EnableJpaRepositories(basePackages = {
        "com.example.avaliacao4.repository"
})


@SpringBootApplication
@RestController
public class Avaliacao4Application {

    public static void main(String[] args) {
        SpringApplication.run(Avaliacao4Application.class, args);
    }

}
