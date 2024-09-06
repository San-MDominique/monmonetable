package com.example.atosetableweb.service.Mapper.Imp;

import com.example.atosetableweb.model.AppSetting;
import com.example.atosetableweb.service.Mapper.AppSettingMapperr;
import com.example.atosetableweb.service.dto.AppSettingDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppSettingMapperImp implements AppSettingMapperr {

    private final ModelMapper modelMapper;

    @Override
    public AppSettingDTO fromEntity(AppSetting entity) {
        return modelMapper.map(entity, AppSettingDTO.class);
    }

    @Override
    public AppSetting toEntity(AppSettingDTO dto) {
        return modelMapper.map(dto, AppSetting.class);
    }
}
