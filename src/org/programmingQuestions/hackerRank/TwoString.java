package org.programmingQuestions.hackerRank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoString {
    public static void main(String[] args) {
        String s1 = "beetroot";
        String s2 = "sandals";

        s1 = s1.chars().mapToObj(x -> (char)x).collect(Collectors.toSet()).stream().map(String::valueOf).collect(Collectors.joining());
        s2 = s2.chars().mapToObj(x -> (char)x).collect(Collectors.toSet()).stream().map(String::valueOf).collect(Collectors.joining());



        if (s1.length() > s2.length()) {

            for(char a: s2.toCharArray()) {

                if (s1.contains(String.valueOf(a))) {
                    System.out.println("YES");
                }

            }


        } else {

            for(char a: s1.toCharArray()) {

                if (s2.contains(String.valueOf(a))) {
                    System.out.println("YES");
                }

            }

        }

        System.out.println("NO");

/*        if(lenght == setLenth) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }*/

    }
}
