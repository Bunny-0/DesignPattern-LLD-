package com.example.Design.Pattern.Revision.Adaptor;

public class RazorPay implements PaymentGateway {

    @Override
    public void processPayment(String amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency + " through RazorPay.");
    }
}
