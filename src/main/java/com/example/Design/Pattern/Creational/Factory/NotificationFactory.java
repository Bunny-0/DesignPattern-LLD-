package com.example.Design.Pattern.Creational.Factory;


import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Notification;

@Service
public class NotificationFactory {

    @Autowired
    SMSNotification smsNotification;
    @Autowired
    EmailNotification emailNotification;

    public NotificationService getNotificationObj(String type){

        String TYPE = type.toUpperCase();
        switch (TYPE) {
            case "SMS":
                return smsNotification;
            case "EMAIL":
                return emailNotification;
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
