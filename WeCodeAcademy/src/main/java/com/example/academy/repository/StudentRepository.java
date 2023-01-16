package com.example.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.academy.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
