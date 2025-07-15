package com.example.Design.Pattern.Structural.Facade;


import org.springframework.stereotype.Service;

@Service

public class AccountCreationService {

    public String createAccount(Customer customer) {
        String accNo = "ACC" + System.currentTimeMillis();
        System.out.println("✅ Account created: " + accNo);
        return accNo;
    }
}
