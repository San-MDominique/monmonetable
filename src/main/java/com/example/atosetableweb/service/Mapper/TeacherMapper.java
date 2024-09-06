package com.example.atosetableweb.service.Mapper;

import com.example.atosetableweb.model.Teacher;
import com.example.atosetableweb.service.dto.TeacherDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper extends EntityMapper<TeacherDTO, Teacher> {
}
