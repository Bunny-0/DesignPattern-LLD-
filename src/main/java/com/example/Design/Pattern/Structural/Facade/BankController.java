package com.example.Design.Pattern.Structural.Facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    private  BankingFacade bankingFacade;



    @PostMapping("/open-account")
    public String openAccount(@RequestBody Customer customer) {
        bankingFacade.openBankAccount(customer);
        return "Account opened successfully!";
    }
}
