package org.example.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Find the longest word in a sentence ignoring the spaces and punctuations
 */
public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "The quick, brown fox jumped over the lazy dog!";

        String s = Arrays.stream(
                sentence.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .max(Comparator.comparing(String::length))
                .orElse("");

        System.out.println(s);
    }
}
