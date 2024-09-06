package com.example.atosetableweb.service;


import com.example.atosetableweb.service.dto.SchoolDTO;

import java.util.List;
import java.util.Optional;

public interface SchoolService {
    SchoolDTO save(SchoolDTO SchoolDTO);
    SchoolDTO update(SchoolDTO SchoolDTO);
    void delete(Long id);
    List<SchoolDTO> getAll();
    SchoolDTO initSchool(SchoolDTO schoolDTO);
    SchoolDTO existingParameter();
    Optional<SchoolDTO> findOne(Long id);
}
