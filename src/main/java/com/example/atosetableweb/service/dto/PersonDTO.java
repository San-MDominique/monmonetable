package com.example.atosetableweb.service.dto;


import com.alibaba.excel.annotation.ExcelProperty;
import com.example.atosetableweb.model.Address;
import com.example.atosetableweb.model.Gender;
import com.example.atosetableweb.model.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public  class PersonDTO {

    @ExcelProperty("ID")
    private Long id ;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @ExcelProperty("Prénom")
    private String firstName;
    @ExcelProperty("Nom")
    private String lastName;

    @ExcelProperty("Numéro de Téléphone")
    private String phoneNumber;

    private String urlPicture;

    @ExcelProperty("Genre")
    private Gender gender;
    private Address address;
    private User user;


}
