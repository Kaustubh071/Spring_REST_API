package com.springapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapi.model.Student;

public interface MyRepo extends JpaRepository<Student, Integer> {

}
