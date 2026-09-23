package org.example.medium;

import org.example.medium.dto.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Find the highest paid salary in each department
 */
public class HighestPaidByDept {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "John", 50000, "HR"),
                new Employee(2, "Alice", 70000, "IT"),
                new Employee(3, "Bob", 80000, "IT"),
                new Employee(4, "David", 60000, "Finance"),
                new Employee(4, "Paul", 55000, "HR")

        );

        //returns optional
        Map<String, Optional<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));

        Map<String, Employee> collect1 = employeeList.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(collect);
        System.out.println(collect1);
    }
}
