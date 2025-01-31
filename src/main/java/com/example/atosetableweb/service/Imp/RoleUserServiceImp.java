package com.example.atosetableweb.service.Imp;


import com.example.atosetableweb.repository.RoleUserRepository;
import com.example.atosetableweb.service.Mapper.RoleUserMapper;
import com.example.atosetableweb.service.RoleUserService;
import com.example.atosetableweb.service.dto.RoleUserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleUserServiceImp implements RoleUserService {
    private final RoleUserRepository roleUserRepository;
    private final RoleUserMapper roleUserMapper;
    @Override
    public RoleUserDTO save(RoleUserDTO roleUserDTO) {
        return roleUserMapper.fromEntity(roleUserRepository.save(roleUserMapper.toEntity(roleUserDTO)));
    }

    @Override
    public RoleUserDTO update(RoleUserDTO roleUserDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        roleUserRepository.deleteById(id);
    }

    @Override
    public List<RoleUserDTO> getAll() {
        return roleUserRepository.findAll().stream().map(role -> {
            return roleUserMapper.fromEntity(role);
        }).toList();
    }

    @Override
    public Optional<RoleUserDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<RoleUserDTO> verifyExistingRoles() {
        return List.of();
    }

    @Override
    public List<RoleUserDTO> initRoles(List<RoleUserDTO> rolesUserDTO) {
        log.debug("Request to init roles {}", rolesUserDTO);
        List<RoleUserDTO> roleUserDTOS = getAll();
        if (roleUserDTOS.isEmpty()) {
            rolesUserDTO.forEach(roleUserDTO -> {
                save(roleUserDTO);
            });
        }
        return getAll();
    }
}
