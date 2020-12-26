package org.programmingQuestions.hackerEarth;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Halmintonion {


    /**
     * list=[]
     * itreate through the arr
     * check ith > i+1th to end of list
     * 	true
     * 	    - add it in the list
     * 	equal
     * 	    - continue
     * 	false
     * 	    - continue
     * @param args
     */

    public static void main(String[] args) {
        String str = "16 17 4 3 5 2";
        int[] arr = Arrays.stream(str.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());

        String rt = IntStream.range(0, lst.size())
                .boxed()
                .map(start -> lst.subList(start, lst.size()))
                .mapToInt(x -> {
                    int firstElement = x.get(0);
                    int val = x.stream().filter(innerElements -> innerElements > firstElement).findFirst().orElse(-1);
                    if (val > firstElement)
                        return -1;
                    else
                        return firstElement;
                })
                .filter(x -> x > -1)
                .boxed()
                .map(String::valueOf).collect(Collectors.joining(" "));


        System.out.println(rt);


    }
}
