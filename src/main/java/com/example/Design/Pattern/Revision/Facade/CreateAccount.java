package com.example.Design.Pattern.Revision.Facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAccount {



    public void createAccount( String name, String email, String phoneNumber, String aadhaarNumber){

        System.out.println("Validating Customer Details for Account Creation...");
        ValidationService  validationService = new ValidationService();
        validationService.validateCustomerDetails(name, email, phoneNumber, aadhaarNumber);



    }
}
