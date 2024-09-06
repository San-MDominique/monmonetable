package com.example.atosetableweb.service.Mapper;


import com.example.atosetableweb.model.User;
import com.example.atosetableweb.service.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {
}
