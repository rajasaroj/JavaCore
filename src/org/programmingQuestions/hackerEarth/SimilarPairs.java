package org.programmingQuestions.hackerEarth;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimilarPairs {

    public static void main(String[] args) {
        String str = "1 3 5 7 8 2 5 7";

        // to int array
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        List<List<Integer>> pairList = new ArrayList<>();

        // to treemap
        Map<Integer, Integer> treeMap = new TreeMap<>(
                IntStream.range(0, arr.length)
                        .boxed()
                        .collect(Collectors.toMap(x -> x+1, i -> arr[i]))
        );

        //treeMap.forEach((x,y) -> System.out.println("x: "+ x + " " + "y: "+ y));

        for (Map.Entry<Integer, Integer> entry: treeMap.entrySet()) {
            int mapValue = entry.getValue();
            int keyIdx = entry.getKey();

            if(!checkIfKeyPresent(keyIdx, pairList)) {


                Map.Entry<Integer, Integer> entryInner = searchValueInMapAndGetKey(treeMap, mapValue+1).get();
                if(entryInner !=null) {
                    int idx = entryInner.getKey();
                    int val = entryInner.getValue();


                }


            }

        }

    }

    static Optional<Map.Entry<Integer, Integer>> searchValueInMapAndGetKey(Map<Integer, Integer> treeMap, int mapVal) {
       if(treeMap.containsValue(mapVal)) {
           return treeMap.entrySet()
                   .stream()
                   .filter((x) -> isEqual(x.getValue(), mapVal)).findFirst();
       }

       return Optional.ofNullable(null);
    }

    static boolean isEqual (int x, int y) {
        if (x==y)
            return true;
        return false;
    }

    static boolean checkIfKeyPresent(int idx, List<List<Integer>> pairList) {
        return  pairList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .contains(idx);
    }

    static boolean checkTransitivity() {
        return false;
    }
}
