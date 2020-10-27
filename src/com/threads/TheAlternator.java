package com.threads;


import java.util.concurrent.atomic.AtomicInteger;

class Printer {

    public synchronized void displayEven(AtomicInteger a, int size) {

        while (a.get() <= 20) {

            boolean isOdd = a.get() % 2 != 0;

            if (isOdd) {
                try {
                    Thread.sleep(1000);
                    wait();
                }  catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {

                System.out.println(Thread.currentThread().getName() + " : " + a.getAndIncrement()  );
                notify();
            }

        }
    }

    public synchronized void displayOdd(AtomicInteger a, int size) {

        while (a.get() <= 20) {
            boolean isEven =  a.get() %2 == 0;

            if (isEven) {
                try {
                    Thread.sleep(1000);
                    wait();
                }  catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {

                System.out.println(Thread.currentThread().getName() + " : " + a.getAndIncrement() );
                notify();
            }
        }

    }

}


public class TheAlternator {


    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(1);
        int size = 20;
        Printer p = new Printer();


        Thread t1Odd = new Thread() {
            @Override
            public void run() {
                p.displayOdd(atomicInteger, size);
            }
        };


        Thread t2Even = new Thread() {
            @Override
            public void run() {
                p.displayEven(atomicInteger, size);
            }
        };

        t1Odd.start();
        t2Even.start();

    }



}
