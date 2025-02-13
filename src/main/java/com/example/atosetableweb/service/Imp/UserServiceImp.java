package com.example.atosetableweb.service.Imp;


import com.example.atosetableweb.repository.UserRepository;
import com.example.atosetableweb.service.Mapper.UserMapper;
import com.example.atosetableweb.service.UserService;
import com.example.atosetableweb.service.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public UserDTO save(UserDTO userDTO) {
        return userMapper.fromEntity(userRepository.save(userMapper.toEntity(userDTO)));
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<UserDTO> getAll() {
        return userRepository.findAll().stream().map(user -> {
            return userMapper.fromEntity(user);
        }).toList();
    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<UserDTO> initUser(List<UserDTO> UserDTO) {
        List<UserDTO> userDTOS = getAll();
        if (userDTOS.isEmpty()) {
            UserDTO.forEach(userDTO -> {
                save(userDTO);
            });
        }
        return getAll();
    }
}
