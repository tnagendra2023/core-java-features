package com.java.designpatterns.factory;

/**The Factory design pattern is a creational design pattern
 * that provides an interface for creating objects without exposing the object
 * creation logic to the client.
 * It allows for the creation of objects based on a common interface or base class,
 * while encapsulating the specific object instantiation details within a factory class*/
public class NotificationFactory {
    public Notification createNotification(NotificationType notificationType){
        String notificationChannel = notificationType.name();
        return switch (notificationChannel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Unknown channel " + notificationChannel);
        };
    }
}
