package org.example.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,23,5,1,2,9);

        //Ascending order sorting
        List<Integer> ascending = numbers.stream()
                .sorted()
                .toList();

        //Descending order sorting
        List<Integer> descending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(ascending);
        System.out.println(descending);
    }
}
