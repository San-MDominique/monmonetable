package com.example.atosetableweb.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppSettingDTO {
    private Long id;
    private String smtpServer;
    private Long smtpPort;
    private String smtpUsername;
    private String smtpPassword;
//    private SchoolDTO school;
}
