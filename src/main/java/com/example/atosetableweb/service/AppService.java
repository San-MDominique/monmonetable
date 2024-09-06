package com.example.atosetableweb.service;



import com.example.atosetableweb.service.dto.AppSettingDTO;
import com.example.atosetableweb.service.dto.RoleUserDTO;
import com.example.atosetableweb.service.dto.SchoolDTO;
import com.example.atosetableweb.service.dto.UserDTO;

import java.util.List;

public interface AppService {

    AppSettingDTO initApp(AppSettingDTO appSettingDTO);

    SchoolDTO initSchool(SchoolDTO schoolDTO, AppSettingDTO appSettingDTO);

    List<RoleUserDTO> initRoleUser(List<RoleUserDTO> roleUserDTOs);

    void initUser(List<RoleUserDTO> roleUserDTOs, SchoolDTO schoolDTO, List<UserDTO> userDTOs);
}
