package com.example.atosetableweb.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class AddressDTO {
    private Long id;
    private String city;
    private String street;
    private String country;
}
