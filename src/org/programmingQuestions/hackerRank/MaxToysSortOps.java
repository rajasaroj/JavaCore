package org.programmingQuestions.hackerRank;

import java.util.Arrays;

@FunctionalInterface
interface Test<A, B, C> {
    C apply(A a, B b);

    default void printString() {
        System.out.println("softwaretestinghelp");
    }
}

public class MaxToysSortOps {


    /**
     *
     * Algo 1 (Unoptimized)
     * First Sort the list.

        start window with size 1
        check element smaller than bugget add in Map for key one
        First eletment is equal or to bugget return value 1 and exit.
        break if element ecceeds budget

        start widow with size 2
        sum first window if element smaller that bugget add in map for key one
        slide the window and sum <= buget
        break if element ecceeds budget


     *  Algo 2 (most optimized)
        Sort the data
        initialize counter
        intilize totalSum

        totalsum = totalsum + i

        subtract ans = budget-totalsum
        if ans>=0
        counter++
        else
        break;

     * @param args
     */

    public static void main(String[] args) {
        int[] a = {5 ,8 ,3};

        // Convert from int[] to Intstream to Integer[]
        Integer[] c =Arrays.stream(a).boxed().sorted().toArray(Integer[]::new);

        // Convert from int[] to Intstream to int[]
        int[] cd =Arrays.stream(a).sorted().toArray();
    }

    static int maximumToys(int[] prices, int budget) {

        int counter=0;
        int totalSum=0;

        prices = Arrays.stream(prices)
                .sorted()
                .toArray();

        for (int i=0; i<prices.length; i++) {

            totalSum = totalSum + prices[i];
            int ans = budget - totalSum;
            if(ans >= 0)
                counter++;
            else
                break;

        }

        return counter;

    }
}
