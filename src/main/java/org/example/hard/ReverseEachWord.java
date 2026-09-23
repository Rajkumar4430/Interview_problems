package org.example.hard;

import java.util.Arrays;
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

    }
}
