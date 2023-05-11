package com.java.streams;

import com.java.dto.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<String, Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put("India", new Employee(1, "Jon", "QA", 12000));
        employeeHashMap.put("USA", new Employee(2, "Bob", "QA", 45000));
        employeeHashMap.put("Japan", new Employee(3, "Peter", "DEV", 70000));
        employeeHashMap.put("China", new Employee(4, "Siri", "DEV", 80000));

        /*Sort HashMap by key*/
        employeeHashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("------Sort by value i.e by employee name---------");

        Comparator<Employee> employeeComparatorByName = Comparator.comparing(Employee::name);
        employeeHashMap
                .values()
                .stream()
                .sorted(employeeComparatorByName)
                .forEach(System.out::println);

    }
}
