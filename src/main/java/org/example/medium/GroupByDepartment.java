package org.example.medium;

import org.example.medium.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Group by department and find the average in each department
 */
public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "John", 50000, "HR"),
                new Employee(2, "Alice", 70000, "IT"),
                new Employee(3, "Bob", 80000, "IT"),
                new Employee(4, "David", 60000, "Finance"),
                new Employee(4, "Paul", 55000, "HR")

        );

        Map<String, Double> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collect);

    }
}
