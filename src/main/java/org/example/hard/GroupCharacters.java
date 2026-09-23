package org.example.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList(
                'A', 'b', '3', 'Z', 'x', '#', '7', 'm', '@'
        );

        /*
            DIGIT     → [3, 7]
            UPPERCASE → [A, Z]
            LOWERCASE → [b, x, m]
            OTHER     → [#, @]
        */

        Map<CharCategory, List<Character>> collect = chars.stream()
                .collect(Collectors.groupingBy(
                        GroupCharacters::getCharCategory
                ));

        System.out.println(collect);


    }

    public static CharCategory getCharCategory(Character ch) {
        if(Character.isUpperCase(ch)) return CharCategory.UPPERCASE;
        if(Character.isLowerCase(ch)) return CharCategory.LOWERCASE;
        if(Character.isDigit(ch)) return CharCategory.DIGIT;
        else return CharCategory.OTHER;
    }

}
