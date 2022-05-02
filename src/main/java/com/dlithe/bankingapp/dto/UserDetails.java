package com.dlithe.bankingapp.dto;

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

    private int id;
    private String name;
    private String email;
    private String password;

    private List<ReviewResponse> review;

}

