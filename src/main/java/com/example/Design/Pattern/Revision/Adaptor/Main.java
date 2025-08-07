package com.example.Design.Pattern.Revision.Adaptor;

public class Main {
    public static void main(String[] args) {
        PaymentGateway payU = new PayU();
        payU.processPayment("1000", "INR");

        PaymentGateway razorPay = new RazorPay();
        razorPay.processPayment("2000", "USD");

        PaymentGateway cryptoPay = new CryptoPay("abcd1234efgh5678ijkl9012mnop3456qrst7890uvwx");
        cryptoPay.processPayment("0.5", "BTC");
    }




}
