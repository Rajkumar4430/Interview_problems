package org.example.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("", " ", "hello", "world", "");

        String first = strings.stream()
                .filter(s -> !s.isBlank())
                .findFirst()
                .orElse("-1");

        System.out.println(first);
    }
}
