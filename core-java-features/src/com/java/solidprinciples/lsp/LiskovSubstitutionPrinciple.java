package com.java.solidprinciples.lsp;

/**
 * The Liskov Substitution Principle (LSP) is one of the SOLID principles of object-oriented design
 * It states that objects of a superclass should be replaceable with objects of its subclass without affecting the correctness of the program.
 * The Liskov Substitution Principle helps maintain the integrity of class hierarchies and ensures that the behavior of the program remains consistent when working with different subclasses of a superclass.
 * It promotes code reusability, extensibility, and modularity.
 * */

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        Vehicle vehicle = new Car("Audi", 4, 2023);
        vehicle.displayVehicleDetails();
        // vehicle.model();This would result in a compilation error
        Car car = new Car("Audi", 4, 2023);
        car.model();

        Vehicle vehicle1 = new MotorCycle("Honda Sp Shine", 2, 2023);
        MotorCycle motorCycle = new MotorCycle("Honda Sp Shine", 2, 2023);
        vehicle1.displayVehicleDetails();
        //vehicle1.model();This would result in a compilation error
        motorCycle.model();
    }
}

class Vehicle {
    private final String name;
    private final int noOfWheels;

    public Vehicle(String name, int noOfWheels) {
        this.name = name;
        this.noOfWheels = noOfWheels;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle name is: " + name + " and it has " + noOfWheels + " wheels");
    }
}

class Car extends Vehicle {
    private final int model;

    public Car(String name, int wheels, int model) {
        super(name, wheels);
        this.model = model;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
    }

    public void model() {
        System.out.println("Car model is " + model);
    }
}

class MotorCycle extends Vehicle {

    private final int model;

    public MotorCycle(String name, int wheels, int model) {
        super(name, wheels);
        this.model = model;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
    }

    public void model() {
        System.out.println("Bike model is " + model);
    }
}
