package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.DTO.CustomerDetailRequest;
import com.dlithe.bankingapp.DTO.UserDetails;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String productDetails(String productName);

    String registerCustomer(CustomerDetailRequest customerDetailRequest);

    UserDetails getUserDetails(int userId);

    UserDetails fetchUserByUserName(String userName, int userId);
}
