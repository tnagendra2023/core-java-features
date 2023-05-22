package com.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * By using the Observer design pattern, you can send notifications to multiple devices or clients simultaneously by registering them as observers. The notifications can be customized based on the observer's behavior and the message content passed during the notification process.
 * */
public class ObserverPatternExample {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Observer mobileDevice1 = new MobileDevice("Device1");
        Observer mobileDevice2 = new MobileDevice("Device2");
        Observer emailClient = new EmailClient("example@example.com");

        notificationService.registerObserver(mobileDevice1);
        notificationService.registerObserver(mobileDevice2);
        notificationService.registerObserver(emailClient);

        notificationService.sendNotification("New notification");

        notificationService.removeObserver(mobileDevice2);

        notificationService.sendNotification("Another notification");

    }
}

interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);

}

interface Observer{
    void update(String message);
}

class NotificationService implements Subject{

    private final List<Observer> observers;

    public NotificationService() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer:observers) {
            observer.update(message);
        }
    }

    public void sendNotification(String message) {
        System.out.println("Sending notification: " + message);
        notifyObservers(message);
    }
}

class MobileDevice implements Observer{
    private final String deviceId;

    public MobileDevice(String deviceId){
        this.deviceId=deviceId;
    }

    @Override
    public void update(String message) {
        System.out.println("Mobile Device " + deviceId + " received notification: " + message);
    }
}

class EmailClient implements Observer {
    private final String email;

    public EmailClient(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email sent to " + email + ": " + message);
    }
}
