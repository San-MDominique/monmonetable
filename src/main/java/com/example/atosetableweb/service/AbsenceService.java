package com.example.atosetableweb.service;


import com.example.atosetableweb.service.dto.AbsenceDTO;

import java.util.List;
import java.util.Optional;

public interface AbsenceService {
    AbsenceDTO save(AbsenceDTO AbsenceDTO);
    AbsenceDTO update(AbsenceDTO AbsenceDTO);
    void delete(Long id);
    List<AbsenceDTO> getAll();
    Optional<AbsenceDTO> findOne(Long id);
}
