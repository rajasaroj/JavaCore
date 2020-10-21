package com.threads;

public class ThreadDemo implements Runnable {
    Thread th;


    public ThreadDemo() {

        th = new Thread(this);

        // this will call run() function
        th.start();
        System.out.println("in const Holds Lock = " + Thread.holdsLock(this));
    }

    @Override
    public void run() {
          /* returns true if and only if the current thread holds the
         monitor lock on the specified object */
        System.out.println("in start Holds Lock = " + Thread.holdsLock(this));

        try {


            synchronized (this) {
                System.out.println("in sync Holds Lock = " + Thread.holdsLock(this));

                throw new Exception();
                //System.out.println("out of Catch Holds Lock = " + Thread.holdsLock(this));
            }



        } catch (Exception e) {
            System.out.println("in Catch Holds Lock = " + Thread.holdsLock(this));
            e.printStackTrace();
        }



        System.out.println("out of sync block Holds Lock = " + Thread.holdsLock(this));
    }

    public static void main(String[] args) {
       new ThreadDemo();
    }
}
