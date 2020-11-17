package com.logical;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int a[] = {2, 7, 11, 10, 10};
        int target = 20;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< a.length; i++) {
            map.put(a[i], i);
        }

        for (int i=0; i < a.length; i++) {

            int complement = target - a[i];

            if (map.keySet().contains(complement)) {
                int[] b = new int[] {i, map.get(complement)};

                for (int aa: b)
                System.out.print(aa + ", ");
                break;
            }

        }

    }
}
