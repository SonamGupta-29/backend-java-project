package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("product-details/{productName}")
    public String detail(@PathVariable String productName){
   String result = testService.productDetails(productName);
   return result;
        
    }

}


