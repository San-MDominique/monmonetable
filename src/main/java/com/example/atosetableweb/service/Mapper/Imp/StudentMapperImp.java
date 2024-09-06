package com.example.atosetableweb.service.Mapper.Imp;
import com.example.atosetableweb.model.Student;
import com.example.atosetableweb.service.Mapper.StudentMapperr;
import com.example.atosetableweb.service.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentMapperImp implements StudentMapperr {

    private final ModelMapper modelMapper;

    @Override
    public StudentDTO fromEntity(Student entity) {
        return modelMapper.map(entity, StudentDTO.class);
    }

    @Override
    public Student toEntity(StudentDTO dto) {
        return modelMapper.map(dto, Student.class);
    }

}
