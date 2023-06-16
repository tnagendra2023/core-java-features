package com.java.solidprinciples.dip;

public class PushNotification implements NotificationChannel{
    @Override
    public void sendMessage(String message) {
        System.out.println(message+" sent via Push notification");
    }
}
