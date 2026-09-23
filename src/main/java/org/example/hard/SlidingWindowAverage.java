package org.example.hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
    Given a list of integers, compute the average of every 3-element sliding window
 */
public class SlidingWindowAverage {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4,8,15,16,23,42);
        int k = 4;

        List<Double> list = IntStream.range(0, input.size() - k + 1)
                .mapToObj(i -> input.subList(i, i + k))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0))
                .toList();

        System.out.println(list);
    }
}
