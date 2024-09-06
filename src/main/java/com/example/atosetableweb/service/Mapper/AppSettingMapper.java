package com.example.atosetableweb.service.Mapper;

import com.example.atosetableweb.model.AppSetting;
import com.example.atosetableweb.service.dto.AppSettingDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppSettingMapper extends EntityMapper<AppSettingDTO, AppSetting>  {
}
