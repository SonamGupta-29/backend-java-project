package com.dlithe.bankingapp.serviceimplementation;


import com.dlithe.bankingapp.DTO.CustomerDetailRequest;
import com.dlithe.bankingapp.DTO.UserDetails;
import com.dlithe.bankingapp.entity.Login;
import com.dlithe.bankingapp.repository.LoginDAO;
import com.dlithe.bankingapp.service.TestService;
import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private LoginDAO loginDAO;

    @Override
    public String productDetails(String productName) {
        if (productName != null) {

            switch (productName) {
                case "sugarLipstick":
                    return "brand is sugar and the color nude-pink  with price varying from 700-5000";

                case "shirt":
                    return "shirt color Red and the size s with price varying from 500-2000";

                default:
                    return "No product details found";
            }

        } else {
            return "product name cannot find";

        }
    }

    @Override
    public String registerCustomer(CustomerDetailRequest customerDetailRequest) {

        Login login = new Login();
        login.setName(customerDetailRequest.getName());
        login.setEmail(customerDetailRequest.getEmail());
        login.setPassword(customerDetailRequest.getPassword());


        loginDAO.save(login);
        return "User Saved Successfully";
    }


    @Override
    public UserDetails getUserDetails(int userId) {
        Optional<Login> logins = loginDAO.findById(userId);
        Login login = logins.get();
        UserDetails userDetails = new UserDetails();
        userDetails.setName(login.getName());
        userDetails.setEmail(login.getEmail());
        userDetails.setPassword(login.getPassword());
        return userDetails;

    }
}
