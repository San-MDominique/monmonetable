package com.example.atosetableweb.service.Mapper.Imp;

import com.example.atosetableweb.model.Teacher;
import com.example.atosetableweb.service.Mapper.TeatcherMapperr;
import com.example.atosetableweb.service.dto.TeacherDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TeacherMapperImp implements TeatcherMapperr {
    private final ModelMapper modelMapper;

    @Override
    public TeacherDTO fromEntity(Teacher entity) {
        return modelMapper.map(entity, TeacherDTO.class);
    }

    @Override
    public Teacher toEntity(TeacherDTO dto) {
        return modelMapper.map(dto, Teacher.class);
    }
}
