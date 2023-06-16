package com.java.solidprinciples.dip;

public class SmsNotification implements NotificationChannel{
    @Override
    public void sendMessage(String message) {
        System.out.println(message+" sent via SMS notification");
    }
}
