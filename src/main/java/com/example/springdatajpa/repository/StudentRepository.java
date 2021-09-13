package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("select s from Student s")
    List<Student> getAll();

    @Query("select s from Student s where s.name = ?1")
    List<Student> getListByName(String name);

    @Query("select s from Student s where s.email = ?1")
    List<Student> getListByEmail(String email);
}
