package org.example.myfirstspringbootapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository
    ) {
        return args -> {
            Student abdo = new Student(LocalDate.of(2001, 4, 3), "abdo@gmail.com", "Abdo");
            Student ali = new Student(LocalDate.of(2000, 6, 12), "ali@gmail.com", "Ali");
            studentRepository.saveAll(List.of(abdo, ali));
        };
    }
}
