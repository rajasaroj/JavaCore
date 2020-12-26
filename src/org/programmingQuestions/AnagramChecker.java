package org.programmingQuestions;

import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramChecker {

    public static void main(String[] args) {
        String anagram1 = "ggeedeabc";
        String anagram2 = "abcggeede";



        boolean aa= anagram2.chars()
                    .mapToObj(x -> (char)x)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .containsAll(anagram1.chars()
                            .mapToObj(x -> (char)x)
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                            .entrySet());

        System.out.println(aa);
    }
}
