package org.example.superEasy;

import java.util.Arrays;
import java.util.List;

public class EvenSquaredSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(result);
    }
}
