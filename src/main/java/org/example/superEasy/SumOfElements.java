package org.example.superEasy;

import java.util.Arrays;
import java.util.List;

/*
    Find the sum of elements in the given list
 */
public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Integer reduce = numbers.stream()
                //.reduce(0, (a,b) -> a+b)
                .reduce(0, Integer::sum);
        System.out.println(reduce);


    }
}
