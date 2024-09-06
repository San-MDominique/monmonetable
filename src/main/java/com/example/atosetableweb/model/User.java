package com.example.atosetableweb.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column (unique = true)
    private String pseudo;

    private String password;

    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<RoleUser> roleUser;

    @ManyToOne
    private School school;

}
