package com.dlithe.bankingapp.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
@EqualsAndHashCode

public class UserDetails {

    private String name;
    private String email;
    private String password;

    private List<ReviewResponse> review;

}

