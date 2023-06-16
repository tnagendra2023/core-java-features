package com.java.solidprinciples.dip;

public class EmailNotification implements NotificationChannel{

    @Override
    public void sendMessage(String message) {
        System.out.println(message+" sent via Email notification");
    }
}
