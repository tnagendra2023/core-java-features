package com.java.designpatterns.facade;

public class Main {
    public static void main(String[] args) {
        OnlineShopFacade onlineShopFacade=new OnlineShopFacade();
        onlineShopFacade.placeOrder("12345", "123 Street", "Credit Card", 100.0);
    }


}

class Inventory{
    public void checkAvailability(String productId){
        System.out.println("Checking product availability.."+productId);
        // Implementation details for checking product availability
    }
}

class PaymentProcessor{
    public void processPayment(String paymentMethod,double amount){
        System.out.println("Processing payment of "+amount+" via "+paymentMethod);
        // Implementation details for processing payment
    }
}

class ShippingService{
    public void shipProduct(String productId,String address){
        System.out.println("Shipping product: " + productId + " to address: " + address);
        // Implementation details for shipping product
    }
}

class OnlineShopFacade{

    private Inventory inventory;
    private PaymentProcessor paymentProcessor;
    private ShippingService shippingService;

    public OnlineShopFacade(){
        inventory=new Inventory();
        paymentProcessor=new PaymentProcessor();
        shippingService=new ShippingService();
    }

    public void placeOrder(String productId,String address,String paymentMethod,double amount){
        inventory.checkAvailability(productId);
        paymentProcessor.processPayment(paymentMethod,amount);
        shippingService.shipProduct(productId,address);
        System.out.println("Order placed successfully!");
    }
}
