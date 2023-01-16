package com.example.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.academy.entity.FeesEntity;

@Repository
public interface FeesRepository extends JpaRepository<FeesEntity, Long> {

}
