package org.example.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> collect = numbers.stream()
//                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println("Even Numbers : " + collect.get(true));
        System.out.println("Odd Numbers : " + collect.get(false));

    }
}
