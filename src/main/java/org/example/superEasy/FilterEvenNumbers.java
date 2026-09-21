package org.example.superEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Filter even numbers from list
 */
public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> list = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
//        .toList();
//        list.add(3);
        System.out.println(list);

        /*
            Since Java 16, we have the direct Stream.toList() method
            -> But if we use direct Stream.toList() what ever the result stream it will be immutable
            if we try to modify we will get UnsupportedOperationException
            -> If we use Stream.collect(Collectors.toList()) method
            the result stream will be mutable which means we can modify the stream
         */

    }
}
