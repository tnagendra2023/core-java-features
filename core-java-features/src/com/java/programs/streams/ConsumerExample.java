package com.java.programs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Alice");
        names.add("Bob");

        // Example 1: Printing names using Consumer
        Consumer<String> printName = System.out::println;
        names.forEach(printName);

        // Example 2: Modifying names using Consumer
        Consumer<String> addPrefix = name -> {
            String modifiedName = "Mr. " + name;
            System.out.println(modifiedName);
        };
        names.forEach(addPrefix);
    }
}
