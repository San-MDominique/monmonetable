package com.example.atosetableweb.service;


import com.example.atosetableweb.service.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO save(UserDTO UserDTO);
    UserDTO update(UserDTO UserDTO);
    void delete(Long id);
    List<UserDTO> getAll();
    Optional<UserDTO> findOne(Long id);
    List<UserDTO> initUser(List<UserDTO> UserDTO);
}
