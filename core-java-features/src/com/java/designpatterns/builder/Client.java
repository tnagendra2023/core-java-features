package com.java.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .brand("Audi")
                .horsePower(140)
                .color("Black")
                .build();
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Color: " + car.getColor());
        System.out.println("Horsepower: " + car.getHorsePower());
    }
}
