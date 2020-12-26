package org.programmingQuestions;

import java.util.stream.IntStream;

public class PalindromCheckUsingStreams {
    public static void main(String[] args) {

        String str = "madam";

        boolean st = IntStream.range(0, str.length())
                .boxed()
                .allMatch(x -> str.toCharArray()[x] == str.toCharArray()[str.length()-x-1]);

        System.out.println(st);
    }
}
