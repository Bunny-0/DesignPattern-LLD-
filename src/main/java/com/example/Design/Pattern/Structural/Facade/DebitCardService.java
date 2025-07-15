package com.example.Design.Pattern.Structural.Facade;


import org.springframework.stereotype.Service;

@Service
public class DebitCardService {

    public String issueCard(String accountNumber) {
        String card = "CARD" + System.nanoTime();
        System.out.println("✅ Debit Card issued for Account: " + accountNumber);
        return card;
    }
}
