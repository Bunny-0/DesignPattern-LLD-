package com.example.Design.Pattern.Structural.Adapter;

public class PaymentAdapter implements PaymentProcessor{
    oldPaymentGateway oldPaymentGateway;

    PaymentAdapter(oldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }
    @Override
    public void payU(String amount) {
        oldPaymentGateway.processPayment(amount,"USD");
    }
}
