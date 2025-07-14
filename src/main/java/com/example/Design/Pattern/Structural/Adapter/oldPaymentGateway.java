package com.example.Design.Pattern.Structural.Adapter;

public class oldPaymentGateway {

    public void processPayment(String amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency + " using old payment gateway.");
    }
}
