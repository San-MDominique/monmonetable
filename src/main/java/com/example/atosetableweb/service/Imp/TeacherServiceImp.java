package com.example.atosetableweb.service.Imp;


import com.example.atosetableweb.model.Gender;
import com.example.atosetableweb.repository.TeacherRepository;
import com.example.atosetableweb.service.Mapper.TeatcherMapperr;
import com.example.atosetableweb.service.TeacherService;
import com.example.atosetableweb.service.dto.TeacherDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeacherServiceImp implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final TeatcherMapperr teacherMapperr;

    @Override
    public TeacherDTO save(TeacherDTO teacherDTO) {
        return teacherMapperr.fromEntity(teacherRepository.save(teacherMapperr.toEntity(teacherDTO)));
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        return findOne(teacherDTO.getId()).map(existingAddress -> {
            existingAddress.setFirstName(teacherDTO.getFirstName());
            existingAddress.setLastName(teacherDTO.getLastName());
            return save(existingAddress);
        }).orElseThrow(() -> new RuntimeException("Nom not found"));
    }

    @Override
    public void delete(Long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public List<TeacherDTO> getAll() {
        return teacherRepository.findAll().stream().map(address -> {
            return teacherMapperr.fromEntity(address);
        }).toList();
    }

    @Override
    public Optional<TeacherDTO> findOne(Long id) {
        return teacherRepository.findById(id).map(address -> {
            return teacherMapperr.fromEntity(address);
        });
    }

    @Override
    public List<TeacherDTO> findByLastNameOrSpecialtyAndGender(String query,String gender) {
        return teacherRepository.findByLastNameOrSpecialtyAndGender(query,query, Gender.valueOf(gender)).stream().map(
                teacher -> {
                    return teacherMapperr.fromEntity(teacher);
                }).toList();
    }
}
