package org.example.medium;

import org.example.medium.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "John", 50000),
                new Employee(102, "Alice", 70000),
                new Employee(103, "Bob", 45000),
                new Employee(104, "David", 90000)
        );

        List<Employee> list = employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())  //will sort in descending
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(list);
    }
}
