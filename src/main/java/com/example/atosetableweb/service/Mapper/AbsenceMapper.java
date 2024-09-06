package com.example.atosetableweb.service.Mapper;

import com.example.atosetableweb.model.Absence;
import com.example.atosetableweb.service.dto.AbsenceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AbsenceMapper extends EntityMapper<AbsenceDTO, Absence> {
}
