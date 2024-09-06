package com.example.atosetableweb.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO extends PersonDTO {
    private boolean available;
    private String specialty;
}
