package com.example.Design.Pattern.Revision.Facade;

import org.springframework.beans.factory.annotation.Autowired;

public class Main {



    public static void main(String args[]){

        CreateAccount createAccount = new CreateAccount();
        createAccount.createAccount("shubham","shubham@Gmail.com","1234567890", "1234-5678-9012");
    }
}
