package com.dlithe.bankingapp.serviceimplementation;


import com.dlithe.bankingapp.dto.CustomerDetailRequest;
import com.dlithe.bankingapp.dto.ReviewResponse;
import com.dlithe.bankingapp.dto.UserDetails;
import com.dlithe.bankingapp.entity.Login;
import com.dlithe.bankingapp.repository.LoginDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl<CustomerDetails> implements TestService {


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

        List<ReviewResponse> userReview = new ArrayList<>();  //List

        Optional<Login> logins = loginDAO.findById(userId);  //DB Call

        Login login = logins.get();     //fetch the detail of optional object

        UserDetails userDetailsResponse = new UserDetails();
        userDetailsResponse.setName(login.getName());
        userDetailsResponse.setEmail(login.getEmail());
        userDetailsResponse.setPassword(login.getPassword());

        ReviewResponse reviewResponse = new ReviewResponse();
        reviewResponse.setReviewName("Sonam");
        reviewResponse.setComment("Nice");
        reviewResponse.setRating("4.5");

        ReviewResponse reviewResponse1 = new ReviewResponse();
        reviewResponse1.setReviewName("Shivani");
        reviewResponse1.setComment("good");
        reviewResponse1.setRating("3.3");

        ReviewResponse reviewResponse2 = new ReviewResponse();
        reviewResponse2.setReviewName("Shiv");
        reviewResponse2.setComment("worst");
        reviewResponse2.setRating("1");

        userReview.add(reviewResponse);
        userReview.add(reviewResponse1);
        userReview.add(reviewResponse2);

        userDetailsResponse.setReview(userReview);


        return userDetailsResponse;
    }

    @Override
    public UserDetails fetchUserByUserName(String userName, int userId) {

        UserDetails userdetails = new UserDetails();

        Login login = loginDAO.findByName(userName, userId);

        userdetails.setId(login.getId());
        userdetails.setName(login.getName());
        userdetails.setEmail(login.getEmail());
        userdetails.setPassword(login.getPassword());

        return userdetails;
    }

}




