package org.programmingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class MaximumValueArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        Integer a = Arrays.stream(arr)
                .max().getAsInt();



        System.out.println(a);

        int max =-1;
        int semax = -1;

        for (int ar: arr) {
            if (ar > max)
                max = ar;
        }

        for (int ar : arr) {
            if (ar > semax && ar < max) {
                semax = ar;
            }
        }

        System.out.println(max);
        System.out.println(semax);

        Integer abb = Arrays.stream(new Integer[]{1, 3, 3, 100})
                .max(Comparator.comparing(Function.identity())).get();

        System.out.println(abb);
    }
}
