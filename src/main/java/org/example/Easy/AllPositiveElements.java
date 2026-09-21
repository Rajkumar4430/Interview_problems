package org.example.Easy;

import java.util.Arrays;
import java.util.List;

public class AllPositiveElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,-1,3,-4,-5);

        boolean b = numbers.stream()
                .allMatch(n -> n > 0);

        //we can also use filter as well

        System.out.println(b);
    }
}
