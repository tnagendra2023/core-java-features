package com.java.programs;

import com.java.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNthHighestSalary {
    public static void main(String[] args) {
        List<Employee> salaryList = Arrays.asList(
                new Employee(1,"Jhon","Dev",40000),
                new Employee(2,"Alex","Dev",40000),
                new Employee(3,"Siri","Dev",20000),
                new Employee(4,"James","Dev",10000)
        );

        System.out.println(getNthHighestSalary(1,salaryList));

    }

    public static Map.Entry<Double,List<String>> getNthHighestSalary(int n, List<Employee> employeeList){
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::salary, Collectors.mapping(Employee::name,Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(n-1);


    }
}
