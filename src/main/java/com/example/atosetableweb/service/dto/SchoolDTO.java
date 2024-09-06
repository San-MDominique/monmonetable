package com.example.atosetableweb.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolDTO {
    private Long id;
    private String name;
    private String logo;
    private AppSettingDTO appSetting;
}
