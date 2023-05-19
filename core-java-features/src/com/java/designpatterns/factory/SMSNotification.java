package com.java.designpatterns.factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS notification sent..");
    }
}
