package com.example.atosetableweb.service.Mapper.Imp;
import com.example.atosetableweb.model.RoleUser;
import com.example.atosetableweb.service.Mapper.RoleUserMapper;
import com.example.atosetableweb.service.dto.RoleUserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RoleUserMapperImp implements RoleUserMapper {

    private final ModelMapper modelMapper;

    @Override
    public RoleUserDTO fromEntity(RoleUser entity) {
        return modelMapper.map(entity, RoleUserDTO.class);
    }

    @Override
    public RoleUser toEntity(RoleUserDTO dto) {
        return modelMapper.map(dto, RoleUser.class);
    }
}
