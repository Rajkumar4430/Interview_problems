package org.example.superEasy;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

/*
    Find first number greater than 10 in the list
 */
public class FindFirstNumberGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,12,11,15,5,20);

        Integer i = numbers.stream()
                .filter(n -> n > 10) //12,11,15
                .sorted()  //11,12,15
                .findFirst() //11
                .orElse(0);
        System.out.println(i);
    }
}
