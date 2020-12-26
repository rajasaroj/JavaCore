package org.programmingQuestions;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatedChar {
    public static void main(String[] args) {
        String str = "aaaaabbbbbcdddddeeefg";


        str.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
