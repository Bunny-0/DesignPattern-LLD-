package com.example.Design.Pattern.Revision.Facade;

import org.springframework.stereotype.Service;

@Service
public class GenrateDebitService {

    public void generateDebitCard(String accountNumber) {

        String debitCardNumber = "DC" + System.currentTimeMillis();
        System.out.println("✅ Debit Card Generated: " + debitCardNumber);
        System.out.println("Thanks for using our service! Your Debit Card is ready for use.");
    }
}
