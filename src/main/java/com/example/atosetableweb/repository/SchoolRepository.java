package com.example.atosetableweb.repository;


import com.example.atosetableweb.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Long> {
}
