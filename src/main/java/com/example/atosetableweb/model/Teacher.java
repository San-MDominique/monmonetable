package com.example.atosetableweb.model;


import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Teacher extends Person {
    private boolean available;
    private String specialty;
}
