package com.logical;

import java.util.PriorityQueue;

public class RunningMedianOptimized {

    public static void main(String[] args) {
        int[] a = {12, 4, 5, 3, 8, 7};
        double[] b = new double[a.length];

        PriorityQueue<Double> priorityQueueMin = new PriorityQueue<>((o1, o2) -> {
            if (o1 > o2)
                return -1;
            else
                return 1;
        });

        PriorityQueue<Double> priorityQueueMax = new PriorityQueue<>();

        for (int i=0; i<a.length; i++) {
            add(priorityQueueMin, priorityQueueMax, a[i]);
            rebalance(priorityQueueMin, priorityQueueMax);
            b[i] = getMedian(priorityQueueMin, priorityQueueMax);
        }

        displaydub(b);

    }

    public static void add(PriorityQueue<Double> lower, PriorityQueue<Double> higher, int number) {

        if (lower.isEmpty() || number < lower.peek()) {
            lower.add((double) number);
        } else {
            higher.add((double) number);
        }
    }

    public static void rebalance (PriorityQueue<Double> lower, PriorityQueue<Double> higher) {

        PriorityQueue<Double> bigger = (lower.size() > higher.size()) ? lower : higher;
        PriorityQueue<Double>  smaller = (lower.size() < higher.size()) ? lower : higher;


        if ( (bigger.size() - smaller.size()) >=2 ) {
            smaller.add(bigger.poll());
        }
    }

    public static Double getMedian(PriorityQueue<Double> lower, PriorityQueue<Double> higher) {
        PriorityQueue<Double> bigger = (lower.size() > higher.size()) ? lower : higher;
        PriorityQueue<Double>  smaller = (lower.size() < higher.size()) ? lower : higher;

        if (lower.size() == higher.size()) {

            double med = ((double)higher.peek() + (double)lower.peek()) / 2;
            return med;

        } else {
            return bigger.peek();
        }

    }


    public static void display(int[] a) {
        for(int ab: a) {
            System.out.print(ab + " ");
        }
        System.out.println();
    }

    public static void displaydub(double[] a) {
        for(double ab: a) {
            System.out.print(ab + ", ");
        }
        System.out.println();

        int[] aaa;

        
    }
}
