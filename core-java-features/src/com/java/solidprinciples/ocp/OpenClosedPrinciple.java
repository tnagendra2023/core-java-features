package com.java.solidprinciples.ocp;

public class OpenClosedPrinciple {
    public static void main(String[] args) {

/*       * By adhering to the Open-Closed Principle,
         * the existing code that depends on the PaymentMethod interface remains unaffected
         * by the addition of new payment methods.
         * This allows for easy extensibility of the system,
         * as new payment methods can be added without modifying the existing code.*/

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(100, new CreditCardPayment());
        paymentProcessor.processPayment(200, new PayPalPayment());
        paymentProcessor.processPayment(300, new GooglePayment());
    }
}

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}

class GooglePayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Google Pay");
    }
}

class PaymentProcessor {
    public void processPayment(double amount, PaymentMethod paymentMethod) {
        paymentMethod.pay(amount);
    }
}
