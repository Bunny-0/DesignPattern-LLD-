package com.example.Design.Pattern.Structural.Adapter;

public class checkOutService {

    private final PaymentProcessor paymentProcessor;

    public checkOutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double total) {
        paymentProcessor.payU(String.valueOf(total));
    }
}
