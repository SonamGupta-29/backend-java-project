package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.CustomerDetailRequest;
import com.dlithe.bankingapp.dto.UserDetails;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("product-details/{productName}")
    public String detail(@PathVariable String productName) {
        String result = testService.productDetails(productName);
        return result;

    }

    @PostMapping("register-customer")
    public String registerCustomerDetails(@RequestBody CustomerDetailRequest customerDetailRequest) {

        return testService.registerCustomer(customerDetailRequest);
    }


    @GetMapping("get-user-details/{userId}")
    public UserDetails fetchUserDetails(@PathVariable int userId){

        return testService.getUserDetails(userId);
    }


    @GetMapping("user-details/{userName}/{userId}")
    public UserDetails fetchDataOfUserDetails(@PathVariable String userName, @PathVariable int userId){

        return testService.fetchUserByUserName(userName,userId);
    }
}




