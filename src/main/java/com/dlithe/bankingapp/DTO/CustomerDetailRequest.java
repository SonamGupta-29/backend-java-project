package com.dlithe.bankingapp.DTO;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CustomerDetailRequest {

    private String firstName;
    private String lastName;
    private String mobileNum;

}
