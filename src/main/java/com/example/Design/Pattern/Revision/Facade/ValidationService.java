package com.example.Design.Pattern.Revision.Facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    @Autowired
    GeneratingAccountNumber generatingAccountNumber;

    public void validateCustomerDetails(String name, String email, String phoneNumber, String aadhaarNumber) {

        // Add validation logic here
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        if (phoneNumber == null || phoneNumber.length() < 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        if (aadhaarNumber == null || aadhaarNumber.length() != 12) {
            throw new IllegalArgumentException("Invalid Aadhaar number");
        }

        System.out.println("✅ Customer details validated successfully.");
        System.out.println("initializing account creation...");
        generatingAccountNumber.generateAccountNumber();



    }
}
