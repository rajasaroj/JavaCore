package org.programmingQuestions.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByComparator {

    public static void main(String[] args) {
        List<Integer> at = new ArrayList<>();

        at.add(5);
        at.add(2);
        at.add(3);

        List<String> et = new ArrayList<>();

        et.add("e");
        et.add("d");
        et.add("a");

        Comparator<Integer> lst = Comparator.comparingInt(x -> x);

        Comparator<String> str = (x, y) -> {
            return x.compareTo(y);
        };

        at.sort(lst);
        System.out.println(at);

        et.sort(str);
        System.out.println(et);
    }
}
