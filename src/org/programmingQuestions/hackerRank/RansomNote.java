package org.programmingQuestions.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {
    public static void main(String[] args) {
        String[] magazine = "give me one grand today night".split(" ");
        String[] note = "give one grand today".split(" ");




 /*       boolean at = Arrays.stream(magazine)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                .entrySet()
                                .containsAll(
                                        Arrays.stream(note)
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                                .entrySet()
                                );

        */

        // Fastest Solution
        List<String> magList = new ArrayList<>(Arrays.asList(magazine)) ;
        List<String> notelist = new ArrayList<>(Arrays.asList(note)) ;

        magList.stream().sorted();
        notelist.stream().sorted();

        for (String s: notelist) {

            if(!magList.remove(s)) {
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");

    }
}
