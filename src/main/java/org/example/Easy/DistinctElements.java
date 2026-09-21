package org.example.Easy;

import java.util.Arrays;
import java.util.List;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,1,3,4,2,5,1,6,5,2,3);

        List<Integer> list = numbers.stream()
                .distinct()
                .toList();
        System.out.println(list);
    }
}
