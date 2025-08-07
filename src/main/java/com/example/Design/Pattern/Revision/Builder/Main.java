package com.example.Design.Pattern.Revision.Builder;

public class Main {

    User user = new User.BuilderClass().address("Ranchi").email("r@gmai.com").firstName("SHubham").lastName("Gaurav").phoneNumber("1234567890").city("Koderma").state("Jharkhand").Build();

}
