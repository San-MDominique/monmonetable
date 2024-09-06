package com.example.atosetableweb.service.Imp;


import com.example.atosetableweb.repository.StudentCardRepository;
import com.example.atosetableweb.service.Mapper.StudentCardMapper;
import com.example.atosetableweb.service.StudentCardService;
import com.example.atosetableweb.service.dto.StudentCardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentCardServiceImp implements StudentCardService {
    private final StudentCardMapper studentCardMapper;
    private final StudentCardRepository studentRepository;
    @Override
    public StudentCardDTO save(StudentCardDTO studentCardDTO) {
        return studentCardMapper.fromEntity(studentRepository.save(studentCardMapper.toEntity(studentCardDTO)));
    }

    @Override
    public StudentCardDTO update(StudentCardDTO studentCardDTO) {
//        return findOne(studentCardDTO.getStudent().).map(existingAddress -> {
//            existingAddress.setFirstName(studentCardDTO.getFirstName());
//            existingAddress.setLastName(studentCardDTO.getLastName());
//            return save(existingAddress);
//        }).orElseThrow(() -> new RuntimeException("Nom not found"));
        return null;
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<StudentCardDTO> getAll() {
        return studentRepository.findAll().stream().map(address -> {
            return studentCardMapper.fromEntity(address);
        }).toList();
    }

    @Override
    public Optional<StudentCardDTO> findOne(Long id) {
        return studentRepository.findById(id).map(address -> {
            return studentCardMapper.fromEntity(address);
        });
    }
}
