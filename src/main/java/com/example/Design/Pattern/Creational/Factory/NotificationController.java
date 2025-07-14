package com.example.Design.Pattern.Creational.Factory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    NotificationFactory notificationFactory;

    @GetMapping("/sendNotification/{type}")
    public void setNotificationService(@PathVariable String type){
        NotificationService res = notificationFactory.getNotificationObj(type);
        res.sendNotification("This is a test message for " + type + " notification.");


    }
}
