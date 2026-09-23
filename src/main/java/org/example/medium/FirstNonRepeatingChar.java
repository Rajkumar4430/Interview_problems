package org.example.medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Find first non repeating character in a string
 */
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";

        Map.Entry<Character, Long> characterLongEntry = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .orElse(null);

        System.out.println(characterLongEntry);
    }
}
