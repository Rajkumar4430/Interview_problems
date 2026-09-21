package org.example.Easy;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,12,3,9,-5);
/*
        List<Integer> list = numbers.stream()
                .filter(n -> n % 3 == 0)
                .toList();

 */
        //if any number in the list divisible by 3 then return true
        boolean b = numbers.stream()
                .anyMatch(n -> n % 3 == 0);

        System.out.println(b);
    }
}
