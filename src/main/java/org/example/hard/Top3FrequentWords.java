package org.example.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentWords {
    public static void main(String[] args) {
        String s = "Java is great. Java is object oriented. Java streams are powerful, and java is fun!";


//        Map<String, Long> map = Arrays.stream(s.toLowerCase()
//                .replaceAll("[^a-z\\s]", "")
//                .split(" ")
//        ).collect(Collectors.groupingBy(
//                Function.identity(),
//                Collectors.counting()
//        ));
//
//        System.out.println(map);
//
//        //sorting
//        List<Map.Entry<String, Long>> sorted = map.entrySet().stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//                .toList();
//
//        System.out.println(sorted);
//
////        how many are distinct
//        List<Long> freq = sorted.stream()
//                .map(Map.Entry::getValue)
//                .distinct()
//                .limit(3)
//                .toList();
//
//        System.out.println(freq);
//
//        List<Map.Entry<String, Long>> list = sorted.stream()
//                .filter(e -> freq.contains(e.getValue()))
//                .toList();
//
//        System.out.println(list);


        //-----------------------------
        Map<String, Long> map = Arrays.stream(s.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split(" ")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));

        //threshold
        Long l = map.values().stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(0L);

        List<Map.Entry<String, Long>> list = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .filter(e -> e.getValue() >= l)
                .toList();
        System.out.println(list);
    }
}
