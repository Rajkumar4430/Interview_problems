package org.example.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

//        Double result = numbers.stream()
//                .collect(Collectors.averagingInt(Integer::intValue));

        //other way by converting Integer to Int stream
        Double result = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(result);
    }
}
