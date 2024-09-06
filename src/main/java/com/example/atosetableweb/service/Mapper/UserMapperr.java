package com.example.atosetableweb.service.Mapper;


import com.example.atosetableweb.model.User;
import com.example.atosetableweb.service.dto.UserDTO;


public interface UserMapperr extends EntityMapper<UserDTO, User> {
    UserDTO fromEntity(User entity);
}
