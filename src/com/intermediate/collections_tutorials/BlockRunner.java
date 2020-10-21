package com.intermediate.collections_tutorials;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockRunner {



    static int i = 1;
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> at = new ArrayBlockingQueue<Integer>(5);

        Thread producer = new Thread(() -> {
            try {
                while (true){
                    System.out.println("Producer1 cooked: " + i+ " pies.");
                    at.put(i++);
                    Thread.sleep(900);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread producer2 = new Thread(() -> {
            try {


                while (true){
                    System.out.println("Producer2 cooked: " + i+ " pies.");
                    at.put(i++);
                    Thread.sleep(900);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {

                while (true){
                    int i = at.take();
                    System.out.println("Consumer1 ate: " + i+ " pies.");
                    Thread.sleep(900);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer2 = new Thread(() -> {
            try {
                while (true){
                    int i = at.take();
                    System.out.println("Consumer1 ate: " + i+ " pies.");
                    Thread.sleep(900);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        producer2.start();
        consumer.start();
        consumer2.start();

    }



}
