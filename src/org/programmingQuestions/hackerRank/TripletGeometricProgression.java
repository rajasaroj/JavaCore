package org.programmingQuestions.hackerRank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TripletGeometricProgression {


    static List<Long> get() {
        String a = "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1".replaceAll(" ", "");

        return  a.chars()
                .mapToObj(x -> (long) x/49)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
/*        List<Long> arr = new ArrayList<>();
        arr.add(1L);
        arr.add(3L);
        arr.add(3L);
        arr.add(9L);
        arr.add(9L);
        arr.add(9L);
        arr.add(27L);
        arr.add(81L);*/

//        arr.add(1L);
//        arr.add(2L);
//        arr.add(2L);
//        arr.add(4L);
//        arr.add(1L);
//        arr.add(5L);
//        arr.add(5L);
//        arr.add(6L);
//        arr.add(25L);
//        arr.add(125L);
//        arr.add(625L);
        //arr.add(81L);

        List<Long> arr = get();
        //System.out.println(arr);
        Long r = 1L;
        Long bigcount =0L;
        Map<Long, Long> leftMap = new HashMap<>();
        Map<Long, Long> rightMap;
        rightMap = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(rightMap);
        leftMap.putAll(rightMap);
        leftMap.replaceAll((k,v) -> 0L);



        List<Long> longList = new ArrayList<>();
        ListIterator<Long> listIterator = arr.listIterator();

        while (listIterator.hasNext()) {

            Long leftElement = 0L;
            if(listIterator.hasPrevious()) {
                leftElement = listIterator.previous();
                listIterator.next();
            }

            Long midElement = listIterator.next();

            //System.out.println("-------------------------------");
            //System.out.println("Left Element: "+ leftElement);
            //System.out.println("mid Element: "+ midElement);
            decreaseRight(rightMap, midElement);
            increaseleft(leftMap, leftElement);
            //System.out.println("do some processing");

            Long count =0L;


            // Query Left mid/r  * // Query right mid*r
            count = leftMap.getOrDefault(midElement/r, 0L) *
                    rightMap.getOrDefault(midElement*r, 0L);

            //System.out.println("Count: " + count);
            //longList.add(count);
            bigcount = bigcount + count;






        }

        System.out.println(bigcount);

    }

    static void increaseleft(Map<Long, Long> leftMap, Long key) {


        if(key > 0){
        Long value =leftMap.get(key) + 1;
        leftMap.put(key, value);
            System.out.println("LeftMap=> "+leftMap);
        }

    }

    static void decreaseRight(Map<Long, Long> rightMap, Long key) {


        if(key > 0){
            rightMap.put(key, rightMap.get(key)-1);
            System.out.println("rightMap=> "+rightMap);
        }

    }
}
