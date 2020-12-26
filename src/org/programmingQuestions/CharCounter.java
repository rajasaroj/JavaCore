package org.programmingQuestions;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCounter {
    public static void main(String[] args) {
        String at = "abakkacdefegeghiiiijk";

        at.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
