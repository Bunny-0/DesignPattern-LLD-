package com.example.Design.Pattern.Structural.Facade;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankingFacade {

    @Autowired
    private AccountCreationService accountCreationService;
    @Autowired
    private ValidateCustomer validateCustomer;
    @Autowired
    private DebitCardService debitCardService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private KycService kycService;

    public void openBankAccount(Customer customer) {
        System.out.println("\n🏦 Starting account opening process...");

        if (validateCustomer.validateCustomer(customer) && kycService.validateKyc(customer)) {
            String accNo = accountCreationService.createAccount(customer);
            String card = debitCardService.issueCard(accNo);
            notificationService.sendWelcomeEmail(customer.getEmail());
        }

        System.out.println("🏁 Account opening process completed.\n");
    }


}
