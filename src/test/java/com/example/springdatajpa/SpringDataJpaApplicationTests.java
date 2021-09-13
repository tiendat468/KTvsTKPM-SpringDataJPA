package com.example.springdatajpa;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

    private StudentRepository studentRepository;

    @Test
    void getAll() {
       System.out.println(studentRepository.findAll());
    }

    @Test
    public void add() {

        Student student = new Student(1,"Tien Dat","dat123@gmail.com");
        studentRepository.save(student);
    }

    @Test
    public void update(){
        Student student = studentRepository.findAll().get(0);
        student.setName("Dat");
        studentRepository.save(student);
    }

    @Test
    public void delete(){

        studentRepository.deleteById(1);
    }



}
