package com.example.atosetableweb.repository;

import com.example.atosetableweb.model.Gender;
import com.example.atosetableweb.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    List<Teacher> findByLastNameOrSpecialtyAndGender(String lastName, String speciality, Gender gender);
}
