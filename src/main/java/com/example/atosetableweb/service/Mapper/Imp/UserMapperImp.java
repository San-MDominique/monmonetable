package com.example.atosetableweb.service.Mapper.Imp;
import com.example.atosetableweb.model.User;
import com.example.atosetableweb.service.Mapper.UserMapperr;
import com.example.atosetableweb.service.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserMapperImp implements UserMapperr {
    private final ModelMapper modelMapper;
    @Override
    public UserDTO fromEntity(User entity) {
        return modelMapper.map(entity, UserDTO.class);
    }

    @Override
    public User toEntity(UserDTO dto) {
        return modelMapper.map(dto, User.class);
    }
}
