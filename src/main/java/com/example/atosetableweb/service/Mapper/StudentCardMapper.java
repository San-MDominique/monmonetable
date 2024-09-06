package com.example.atosetableweb.service.Mapper;

import com.example.atosetableweb.model.StudentCards;
import com.example.atosetableweb.service.dto.StudentCardDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentCardMapper extends EntityMapper<StudentCardDTO, StudentCards> {
}
