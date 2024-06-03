package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student yashwanth = new Student(1L,
                    "Yashwanth",
                    "abc@gmail.com",
                    LocalDate.of(1999, 8, 21));
            Student nagendra = new Student(1L,
                    "Nagendra",
                    "nagendra@gmail.com",
                    LocalDate.of(1998, 10, 12));
            Student vamsi = new Student(1L,
                    "Vamsi",
                    "vamsi@gmail.com",
                    LocalDate.of(1997, 1, 11));

            studentRepository.saveAll(
                    List.of(yashwanth, nagendra, vamsi)
            );
        };
    }
}
