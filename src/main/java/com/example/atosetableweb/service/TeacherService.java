package com.example.atosetableweb.service;


import com.example.atosetableweb.service.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    TeacherDTO save(TeacherDTO TeacherDTO);
    TeacherDTO update(TeacherDTO TeacherDTO);
    void delete(Long id);
    List<TeacherDTO> getAll();
    Optional<TeacherDTO> findOne(Long id);
    List<TeacherDTO> findByLastNameOrSpecialtyAndGender(String query, String gender);
}
