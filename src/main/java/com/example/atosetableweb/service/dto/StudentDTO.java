package com.example.atosetableweb.service.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.example.atosetableweb.model.Absence;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class StudentDTO extends PersonDTO {

    @ExcelProperty("Matricule")
    private String matricule;

    @ExcelProperty("Numéro de Téléphone du Père")
    private String phoneNumberFather;
    private Set<Absence> absence;
}
