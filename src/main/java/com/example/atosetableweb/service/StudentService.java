package com.example.atosetableweb.service;


import com.example.atosetableweb.service.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentDTO save(StudentDTO studentDTO);
    StudentDTO update(StudentDTO studentDTO);
    void delete(Long id);
    List<StudentDTO> getAll();
    Optional<StudentDTO> findOne(Long id);
    List<StudentDTO> findByLastNameOrGenderOrMatricule(String query, String gender);
}
