package com.threads;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    public static void main(String[] args) throws Exception {
        Runner a = new Runner();
        System.out.println();
        //a.dumb();
        System.out.println();

        Runnable ab = () -> {
            System.out.println("aaa");
            try {
                a.dumb();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread t = new Thread(ab);
        t.run();


        System.out.println(Thread.holdsLock(t));
/*
        Lock aLock = new ReentrantLock();
        Condition bufferNotFull = aLock.newCondition();

        bufferNotFull.await();

        t.wait();
        System.out.println("Compelted");
*/



    }

    public  void dumb() throws Exception {

        synchronized(this) {

            //this.notify();
            System.out.println("hello");
            throw  new Exception("H");

        }

    }
}
