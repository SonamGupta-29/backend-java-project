package com.dlithe.bankingapp.serviceimplementation;


import com.dlithe.bankingapp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

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
}
