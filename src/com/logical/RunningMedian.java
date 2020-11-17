package com.logical;

import java.util.*;

public class RunningMedian {

    public static void main(String[] args) {

        int [] a = {12, 4, 5, 3, 8, 7};
        double[] b = new double[a.length];
        int[] reduced_array = new int[1];


        int k=0;
        for (int i=0; i<a.length; i++) {

            if (i == 0) {
                b[i] = (double) a[i];
                reduced_array[i] = a[i];
                continue;
            }



            Arrays.sort(reduced_array);



            if (reduced_array.length % 2==0) {
                int mid_idx_aft = reduced_array.length / 2;
                int mid_idx_before = mid_idx_aft-1;

                double med = ((double) reduced_array[mid_idx_aft]  + (double) reduced_array[mid_idx_before]  ) / 2;
                b[i] = (double)  med;

            } else {
                b[i] = (double)  reduced_array[reduced_array.length / 2];
            }
        }


        return;


    }

    public static void display(int[] a) {
        for(int ab: a) {
            System.out.print(ab + " ");
        }
        System.out.println();
    }

    public static void displaydub(double[] a) {
        for(double ab: a) {
            System.out.print(ab + " ");
        }
        System.out.println();
    }
}
