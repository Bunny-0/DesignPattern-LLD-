package com.example.Design.Pattern.Structural.Adapter;

public class Main {

    public static void main(String[] args) {
        oldPaymentGateway oldPaymentGateway = new oldPaymentGateway();
        PaymentProcessor paymentProcessor = new PaymentAdapter(oldPaymentGateway);
        checkOutService checkOutService = new checkOutService(paymentProcessor);
        checkOutService.checkout(100.0);
    }
}
