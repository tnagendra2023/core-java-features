package com.java.programs.streams;

import com.java.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindHighestSalByDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(3, "Jon", "IT", 75000),
                new Employee(1, "Peter", "IT", 60000),
                new Employee(2, "Mark", "Sales", 80000),
                new Employee(4, "Alex", "Sales", 90000),
                new Employee(5, "Tony", "HR", 100000),
                new Employee(6, "Siri", "HR", 90000)
        );
        Comparator<Employee> employeeComparator = Comparator.comparingDouble(Employee::salary);
        employeeList.stream()
                .collect(Collectors.toMap(Employee::department, Function.identity(), BinaryOperator.maxBy(employeeComparator)))
                .values()
                .forEach(employee -> System.out.println(employee.name()+"-"+employee.department()+"-"+employee.salary()));

    }
}
