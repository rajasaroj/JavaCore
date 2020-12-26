package org.programmingQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> ast = new ArrayList<>();
        ast.add("a");
        ast.add("d");
        ast.add("c");
        ast.add("b");

        IntStream.range(0, ast.size()).boxed()
                .map(x -> ast.get(  ast.size() - 1 - x))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Set<String> at = new HashSet<>(ast);
        //System.out.println(new ArrayList<>(at));


        //Stream.of(new Integer[]{1, 7, 9 ,4 ,6}).sorted(Collections.reverseOrder()).forEach(System.out::print);

        at.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);

        // Convert to Array
        at.toArray(new String[at.size()]);

    }
}
