package com.example.atosetableweb.service.Mapper.Imp;

import com.example.atosetableweb.model.Address;
import com.example.atosetableweb.service.Mapper.AddressMapper;
import com.example.atosetableweb.service.dto.AddressDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddressMaperImp implements AddressMapper {

    private final ModelMapper modelMapper;
    @Override
    public AddressDTO fromEntity(Address entity) {
        return modelMapper.map(entity, AddressDTO.class);
    }

    @Override
    public Address toEntity(AddressDTO dto) {
        return modelMapper.map(dto, Address.class);
    }
}
