package org.example.medium;

import org.example.medium.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Find all the departments where employees are greater than 2
 */
public class DepartmentEmployeeCount {
    public static void main(String[] args) {
        List< Employee> employeeList= Arrays.asList(
                new Employee(1, "John", 60000, "IT"),
                new Employee(2, "Alice", 55000, "HR"),
                new Employee(3, "Bob", 75000, "IT"),
                new Employee(4, "Carol", 70000, "HR"),
                new Employee(5, "David", 65000, "Finance"),
                new Employee(6, "Eve", 80000, "IT"),
                new Employee(7, "Frank", 64000, "Finance"),
                new Employee(8, "Ala", 44000, "Operations")
        );

        Map<String, Long> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));

        System.out.println(map);
        /*
            Finance=2,
            HR=2,
            IT=3,
            Operations=1

            again we stream on the map and apply filter
         */

        List<String> list = map.entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list); // [IT]


        //combine
        List<String> list1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list1);
    }
}
