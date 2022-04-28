package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.DTO.CustomerDetailRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String productDetails(String productName);

    String registerCustomer(CustomerDetailRequest customerDetailRequest);
}
