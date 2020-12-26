package org.programmingQuestions.hackerRank;

import com.intermediate.collections_tutorials.Collect;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void main(String[] args) {

        int a[] = {6,4,1};

        int count =0;

        for (int i=0; i<a.length; i++) {

            for(int j=0; j<a.length-1; j++) {

                if( a[j] > a[j+1] ) {

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    count++;
                }

            }
        }

        System.out.println("Array is sorted in "+count+ " swaps." );
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[a.length-1]);
    }
}
