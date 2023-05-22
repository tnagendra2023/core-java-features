package com.java.solidprinciples;

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.run();

        Fish fish = new Fish();
        fish.swim();
    }
}
interface Swimmable{
    void swim();
}

interface Runnable{
    void run();
}
interface Flyable{
    void fly();
}

class Bird implements Flyable, Runnable{

    @Override
    public void run() {
        System.out.println("Bird is running...");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");

    }
}
class Fish implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Fish is swimming...");
    }
}

