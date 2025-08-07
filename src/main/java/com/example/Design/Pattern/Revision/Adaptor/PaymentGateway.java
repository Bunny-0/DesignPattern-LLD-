package com.example.Design.Pattern.Revision.Adaptor;

public interface PaymentGateway {

    public void processPayment(String amount, String currency);
}
