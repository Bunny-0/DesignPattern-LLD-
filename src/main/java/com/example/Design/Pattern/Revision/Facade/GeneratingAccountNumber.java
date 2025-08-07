package com.example.Design.Pattern.Revision.Facade;

import com.example.Design.Pattern.Structural.Facade.DebitCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneratingAccountNumber {
    @Autowired
    DebitCardService debitCardService;

    public void generateAccountNumber() {
        String accountNumber = "ACC" + System.currentTimeMillis();
        System.out.println("✅ Account Number Generated: " + accountNumber);
        System.out.println("DebitCard Generation  started for Account Number: " + accountNumber);
        debitCardService.issueCard(accountNumber);

        // Here you can add logic to save the account number to a database or perform other operations
    }
}
