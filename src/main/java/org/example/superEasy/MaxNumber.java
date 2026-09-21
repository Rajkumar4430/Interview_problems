package org.example.superEasy;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,10,2,48,20);

        Integer max = numbers.stream()
//                .reduce((a,b) -> Integer.max(a,b))
                .reduce(Integer::max)
                        .orElse(0);

//        Integer max1 = numbers.stream()
//                        .reduce(Integer::max)
//                                .get();

        System.out.println(max);
    }
}
