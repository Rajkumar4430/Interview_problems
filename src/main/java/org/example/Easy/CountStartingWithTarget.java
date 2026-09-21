package org.example.Easy;

import java.util.Arrays;
import java.util.List;

/*
    count how many strings start with specific letter
 */
public class CountStartingWithTarget {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        long result = fruits.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .count() ;
        System.out.println(result);
    }
}
