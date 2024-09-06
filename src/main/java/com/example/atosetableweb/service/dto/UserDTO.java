package com.example.atosetableweb.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter

public class UserDTO {
    private Long id ;
    private String pseudo;
    private String password;
    private Date creationDate;
    private Set<RoleUserDTO> roleUser;
    private SchoolDTO school;
}
