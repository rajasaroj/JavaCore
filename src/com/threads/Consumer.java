package com.threads;

import java.util.Queue;

public class Consumer extends Thread{

    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue, int maxSize, String name)
    {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

}
