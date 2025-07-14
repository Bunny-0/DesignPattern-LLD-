package com.example.Design.Pattern.Creational.Factory;

import org.springframework.stereotype.Service;

@Service
public class SMSNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification sent with message: " + message);
    }
}
