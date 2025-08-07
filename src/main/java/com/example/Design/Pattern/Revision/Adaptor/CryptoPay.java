package com.example.Design.Pattern.Revision.Adaptor;

public class CryptoPay implements PaymentGateway {
    String walletAddress;
    CryptoPay(String walletAddress){
        this.walletAddress = walletAddress;
    }


    public void processCrypto(String walletAddress, double amount){
        System.out.println("Processing payment of " + amount + " CryptoPay.");
    }

    @Override
    public void processPayment(String amount, String currency) {
        processCrypto(walletAddress, Double.parseDouble(amount));
        System.out.println("Processing payment of " + amount + " " + currency + " through CryptoPay.");
    }
}
