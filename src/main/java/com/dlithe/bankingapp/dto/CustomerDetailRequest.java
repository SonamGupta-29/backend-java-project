package com.dlithe.bankingapp.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CustomerDetailRequest {

    private int id;
    private String name;
    private String email;
    private String password;


}
