package com.datastructure;

import java.util.Comparator;
import java.util.PriorityQueue;

class Jumbo {
    int priority;
    String name;

    public Jumbo(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class PrioTest {



    public static void main(String[] args) {



        Jumbo j1 = new Jumbo(-1, "j1");
        Jumbo j2 = new Jumbo(2, "j2");
        Jumbo j3 = new Jumbo(3, "j3");
        Jumbo j4 = new Jumbo(0, "j4");
        Jumbo j5 = new Jumbo(5, "j5");

        PriorityQueue<Jumbo> priorityQueue = new PriorityQueue<>(new Comparator<Jumbo>() {
            @Override
            public int compare(Jumbo o1, Jumbo o2) {
                return (o1.priority > o2.priority) ? 1 : -1;
            }
        });


        int[] aaa = new int[0];

        priorityQueue.add(j1);
        priorityQueue.add(j2);
        priorityQueue.add(j3);
        priorityQueue.add(j4);
        priorityQueue.add(j5);

        System.out.println(priorityQueue.poll().priority);
        System.out.println(priorityQueue.poll().priority);
        System.out.println(priorityQueue.poll().priority);
        System.out.println(priorityQueue.poll().priority);
        System.out.println(priorityQueue.poll().priority);




    }
}
