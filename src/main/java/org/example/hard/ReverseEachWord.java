package org.example.hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Java streams are powerful";

        String collect = Arrays.stream(s.toLowerCase()
                        .split("\\s")
                ).map(i -> new StringBuilder(i).reverse().toString())
                .collect(Collectors.joining(" "));


        System.out.println(collect);

        String collect1 = Arrays.stream(s.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (rev, ch) -> ch + rev)
                ).collect(Collectors.joining(" "));

        System.out.println(collect1);

        String collect2 = Arrays.stream(s.split(" "))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));

        System.out.println(collect2);

        String s1 = Arrays.stream(s.split("\\s+"))
                .reduce((word1, word2) -> word2 + " " + word1)
                .orElse("");

        System.out.println(s1);

    }
}
