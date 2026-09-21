package org.example.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Join Strings all strings in a list into a single comma-separated string
 */
public class JoinStrings {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        String collect = fruits.stream()
                .collect(Collectors.joining("-"));

        System.out.println(collect);
    }
}
