package com.example.atosetableweb.service.Mapper.Imp;

import com.example.atosetableweb.model.School;
import com.example.atosetableweb.service.Mapper.SchoolMapperr;
import com.example.atosetableweb.service.dto.SchoolDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchoolMapperImp implements SchoolMapperr {
    private final ModelMapper modelMapper;
    @Override
    public SchoolDTO fromEntity(School entity) {
        return modelMapper.map(entity, SchoolDTO.class);
    }

    @Override
    public School toEntity(SchoolDTO dto) {
        return modelMapper.map(dto, School.class);
    }
}
