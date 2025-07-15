package com.example.Design.Pattern.Structural.Facade;

public class KycService {


    public boolean validateKyc(Customer customer) {
        // Logic to create KYC for the customer
        System.out.println("KYC validated for customer: " + customer.getName());
        return true;
    }
}
