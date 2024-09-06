package com.example.atosetableweb.repository;

import com.example.atosetableweb.model.Gender;
import com.example.atosetableweb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByLastNameIgnoreCaseOrMatriculeIgnoreCaseOrGender(String lastName, String matricule, Gender gender);
}
