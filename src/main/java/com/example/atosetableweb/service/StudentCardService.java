package com.example.atosetableweb.service;


import com.example.atosetableweb.service.dto.StudentCardDTO;

import java.util.List;
import java.util.Optional;

public interface StudentCardService {
    StudentCardDTO save(StudentCardDTO StudentCardDTO);
    StudentCardDTO update(StudentCardDTO StudentCardDTO);
    void delete(Long id);
    List<StudentCardDTO> getAll();
    Optional<StudentCardDTO> findOne(Long id);
}
