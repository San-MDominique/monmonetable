package com.example.atosetableweb.service.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class RegistrationSchoolDto extends SchoolDTO{
    private MultipartFile file;
}
