package com.java.designpatterns.abstractfactory;

/**
* Abstract Factory pattern:
* The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
* It allows you to encapsulate the creation of multiple related objects behind a common interface.
* The key idea is to define a factory interface or abstract class with multiple factory methods,
* each responsible for creating a specific type of object. Concrete factories implement the abstract factory
* and provide the actual implementation of the factory methods to create specific objects.
* The Abstract Factory pattern promotes loose coupling between clients and the concrete implementations,
* allowing easy substitution of object families.
* It is useful when you need to create related objects that are designed to work together.
* */

// Abstract Product: Car
public interface Car {
     void assemble();
}
// Concrete Product: Sedan Car
class SedanCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car...");
        //Business logic related to sedan car assembling
    }
}

class SUVCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling SUV car...");
        //Business logic related to SUV car assembling
    }
}
// Abstract Factory: Car Factory
interface CarFactory{
    Car createCar();
}
// Concrete Factory: Sedan Car Factory
class SedanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        System.out.println("Sedan car has been created..");
        return new SedanCar();
    }
}

// Concrete Factory: SUV Car Factory
class SUVCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        System.out.println("SUV car has been created..");
        return new SUVCar();
    }
}

 class CarManufacturer {
     private CarFactory carFactory;

     CarManufacturer(CarFactory carfactory) {
         Car car = carfactory.createCar();
         car.assemble();
     }
 }

// Client Code
 class Client{
    public static void main(String[] args) {
       new CarManufacturer(new SUVCarFactory());
       new CarManufacturer(new SedanCarFactory());
    }
 }




