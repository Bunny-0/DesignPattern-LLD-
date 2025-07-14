package com.example.Design.Pattern.Creational.Factory;

import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification sent with message: " + message);
    }
}
