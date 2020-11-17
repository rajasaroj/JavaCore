package com.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotatorOptimized {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int size = a.length;
        int roatate  = 3;
        int[] b = new int[size];
        int a_i=0;
        int index = size - roatate;
        List<Integer> ls = new ArrayList<>();

        for(int i=index; i<size; i++) {
            b[i] = a[a_i++];
        }

        for (int i=0; i< index; i++)
        {
            b[i] = a[a_i++];
        }

       for (int l : b)
       {
           ls.add(l);
       }

/*
        for(int i: b) {
            System.out.println(
                    i
            );
        }
*/
        System.out.println(b);

    }

}
