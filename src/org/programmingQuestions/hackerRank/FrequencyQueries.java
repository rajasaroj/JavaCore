package org.programmingQuestions.hackerRank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyQueries {

    static List<List<Integer>> prepareData() {
        String[] str = {"1 3",
                "2 3",
                "3 2",
                "1 4",
                "1 5",
                "1 5",
                "1 4",
                "3 2",
                "2 4",
                "3 2"};

        // If you ever want to convert Intstream to List<Integer>
        // This Conversion path has to be followed Instream => Stream<Integer> using boxed => List<Integer> => using .collect(Collectors.toList())
        return IntStream.range(0, str.length)
                .mapToObj(x -> Arrays.asList(str[x].split(" ")))
                .collect(Collectors.toList())
                .stream()
                 .map(x -> x.stream()
                         .mapToInt(Integer::parseInt)
                         .boxed()
                         .collect(Collectors.toList())
                 )
                 .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> queries = prepareData();
        queries.forEach(System.out::println);
        Map<Integer, Integer> globalMap = new HashMap<>();
        List<Integer> at = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            int action = queries.get(i).get(0);
            int element = queries.get(i).get(1);

            switch (action) {
                case 1:
                    insert(globalMap, element);
                    break;

                case 2:
                    delete(globalMap, element);
                    break;

                case 3:
                    int op = check(globalMap, element);
                    at.add(op);

                    break;

                default:
                    break;
            }
        }

        System.out.println(at);

    }



    static void insert(Map<Integer, Integer> globalMap, int element) {
        globalMap.put(element, globalMap.getOrDefault(element, 0)+1);
        //System.out.println("insert => " + globalMap);
    }
    static void delete(Map<Integer, Integer> globalMap, int element) {

        if (globalMap.containsKey(element)) {
            globalMap.put(element, globalMap.get(element)-1);
        }
        //System.out.println("delete => " + globalMap);

    }
    static int check(Map<Integer, Integer> globalMap, int freq) {

        if (globalMap.values().contains(freq))
            return 1;

        return 0;
    }
}
