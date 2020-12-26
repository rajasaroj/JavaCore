package org.programmingQuestions;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        Integer[] array1 = {1, 4, 7, 9, 2, 2};
        Integer[] arrray2 = {1, 7, 3, 4, 5, 5};

        Arrays.asList(array1)
                .stream()
                .distinct()
                .filter(Arrays.asList(arrray2)::contains)
                .forEach(System.out::println);
    }

}
