package org.example.medium;

import org.example.medium.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Find Department with the average highest salary
 */
public class HighestAvgSalaryDept {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
                new Employee(1, "John", 60000, "IT"),
                new Employee(2, "Alice", 55000, "HR"),
                new Employee(3, "Bob", 75000, "IT"),
                new Employee(4, "Carol", 70000, "HR"),
                new Employee(5, "David", 65000, "Finance"),
                new Employee(6, "Eve", 80000, "IT"),
                new Employee(7, "Frank", 64000, "Finance"),
                new Employee(8, "Ala", 44000, "Operations")
        );

        Map<String, Double> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collect);

        //-----------------------------------------------//
        Map.Entry<String, Double> stringDoubleEntry = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);


        System.out.println(stringDoubleEntry);
    }
}
