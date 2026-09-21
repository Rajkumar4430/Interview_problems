package org.example.medium;

import org.example.medium.dto.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Alice", 25),
                new Person("Alice", 30),
                new Person("Alice", 28),
                new Person("Alice", 35)
        );

        Double collect = personList.stream()
                .collect(Collectors.averagingInt(Person::getAge));
        System.out.println(collect);

        double v = personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(v);
    }
}
