package org.example.medium;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Find most frequent character in a string
 */
public class MostFrequentChar {
    public static void main(String[] args) {
        String input = "banana";

        IntStream chars = input.chars(); // returns intStream
//        chars.forEach(System.out::println); //98,97,110,97,110,97

        // again we need to convert this int to char

        Stream<Character> characterStream = input.chars()
                .mapToObj(c -> (char) c);

//        characterStream.forEach(System.out::println); // banana

        // now we can count the frequency of each char using map

        Map.Entry<Character, Long> characterLongEntry = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(characterLongEntry);
    }

}
