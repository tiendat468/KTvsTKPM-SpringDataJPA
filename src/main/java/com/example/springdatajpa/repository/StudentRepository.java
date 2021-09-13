package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "select * from Student", nativeQuery = true)
    List<Student> getAll();

    @Query(value = "select * from Student where name = ?1",nativeQuery = true )
    List<Student> getListByName(String name);

    @Query(value = "select * from Student where email = ?1",nativeQuery = true )
    List<Student> getListByEmail(String email);
}
