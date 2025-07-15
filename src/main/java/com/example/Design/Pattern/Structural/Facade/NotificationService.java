package com.example.Design.Pattern.Structural.Facade;


import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendWelcomeEmail(String email) {
        System.out.println("📧 Welcome email sent to: " + email);
    }
}
