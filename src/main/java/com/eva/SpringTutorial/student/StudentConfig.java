package com.eva.SpringTutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@email.nl",
                    LocalDate.of(2000, Month.JULY, 15)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@email.nl",
                    LocalDate.of(2003, Month.APRIL, 21)
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
