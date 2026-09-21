package org.example.superEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Count how many elements are greater than the given number in the list
 */
public class CountGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,12,23,20,15,25);

        Long result = numbers.stream()
                .filter(n -> n > 10)
//                .collect(Collectors.counting());
                .count();
        System.out.println(result);
    }
}
