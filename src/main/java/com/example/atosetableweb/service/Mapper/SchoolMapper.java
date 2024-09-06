package com.example.atosetableweb.service.Mapper;

import com.example.atosetableweb.model.School;
import com.example.atosetableweb.service.dto.SchoolDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SchoolMapper extends EntityMapper<SchoolDTO, School> {
}
