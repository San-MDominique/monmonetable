package com.example.atosetableweb.service.Mapper;


import com.example.atosetableweb.model.Student;
import com.example.atosetableweb.service.dto.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper extends EntityMapper<StudentDTO, Student> {
}
