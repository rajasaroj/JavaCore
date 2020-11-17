package com.logical;

import java.util.*;

public class Tesrter {

    public static void main(String[] args) {


        //int[] a = {1, 2, 3, 4};
        //int[] a = {4, 9, 2, 3};

        //int[] a = {4, 4, 9, 2, 3};

        //int[] a = {4 , 1, 2, 3 , 4};

        int[] a ={10,
        18,
        1,
        1,
        16,
        12,
        10,
        18,
        19,
        6,
        6};


        List<Integer> st = new ArrayList();

        for(int i=0; i<a.length; i++) {

            if (i==0) {
                st.add(a[i]);
                continue;
            }

            if (a[i-1] > a[i]) {
                continue;
            } else {
                int min_discount =  Collections.min(st);

                int diff=0;

                if (a[i-1] < min_discount)
                     diff = a[i] - a[i-1];
                else
                    diff = a[i] - min_discount;

                if (diff ==0)
                    continue;

                st.add(diff);
            }


        }

        int total=0;

        System.out.println(st);

        for(int e: st) {
            total = total + e;
        }

        System.out.println(total);


    }


}
