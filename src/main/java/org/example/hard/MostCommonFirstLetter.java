package org.example.hard;

import org.example.medium.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Find the most common character among all the employee names
 */
public class MostCommonFirstLetter {
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

        Map.Entry<Character, Long> characterLongEntry = employeeList.stream()
                .map(e -> e.getName().charAt(0)) // will get all employee first char
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(characterLongEntry);

    }
}
