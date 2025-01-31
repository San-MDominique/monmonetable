package com.example.atosetableweb.service;


import com.example.atosetableweb.service.dto.AppSettingDTO;

import java.util.List;
import java.util.Optional;

public interface AppSettingService {
    AppSettingDTO save(AppSettingDTO AppSettingDTO);
    AppSettingDTO update(AppSettingDTO AppSettingDTO);
    void delete(Long id);
    List<AppSettingDTO> getAll();
    Optional<AppSettingDTO> findOne(Long id);
    AppSettingDTO initApp(AppSettingDTO appSettingDTO);
    AppSettingDTO existingParameter();
    List<AppSettingDTO>findAllBySmtpUsernames(String smtpUsername);
}
