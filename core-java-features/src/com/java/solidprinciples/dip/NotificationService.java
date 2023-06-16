package com.java.solidprinciples.dip;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<NotificationChannel> notificationChannels;

    public NotificationService(List<NotificationChannel> notificationChannelList) {
        this.notificationChannels = notificationChannelList;
    }

    public void sendNotification(String message) {
        for (NotificationChannel channel : notificationChannels) {
            channel.sendMessage(message);
        }
    }

    public static void main(String[] args) {
        NotificationChannel emailNotification = new EmailNotification();
        NotificationChannel smsNotification = new SmsNotification();
        NotificationChannel pushNotification = new PushNotification();

        List<NotificationChannel> notificationChannels=new ArrayList<>();
        notificationChannels.add(emailNotification);
        notificationChannels.add(smsNotification);
        notificationChannels.add(pushNotification);

        NotificationService notificationService=new NotificationService(notificationChannels);
        notificationService.sendNotification("text");
    }
}
