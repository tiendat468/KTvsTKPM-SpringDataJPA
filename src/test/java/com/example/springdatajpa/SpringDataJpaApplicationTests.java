package com.example.springdatajpa;

import com.example.springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

    private StudentRepository studentRepository;

    @Test
    void getAll() {
        System.out.println(studentRepository.getAll());
    }

    @Test
    void findByName() {
        System.out.println(studentRepository.getListByName("Dat"));
    }

    @Test
    void findByEmail() {
        System.out.println(studentRepository.getListByEmail("Dat123@gmail.com"));
    }
}
