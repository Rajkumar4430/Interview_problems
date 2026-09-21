package org.example.superEasy;

import java.util.Arrays;
import java.util.List;

/*
    Convert numbers in the list to their squares
 */
public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(squares);
    }
}
