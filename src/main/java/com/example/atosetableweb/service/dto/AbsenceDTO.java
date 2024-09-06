package com.example.atosetableweb.service.dto;

import com.example.atosetableweb.model.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AbsenceDTO {
    private Long id;
    private Date absenceDate;
    private Long absenceNumber;
    private Student student;
}
