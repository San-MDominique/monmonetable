package com.example.atosetableweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Student extends Person  {
    private String matricule;
    private String phoneNumberFather;


    @OneToMany(mappedBy = "student")
    private Set<Absence> absence;


}