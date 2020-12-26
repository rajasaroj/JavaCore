package org.programmingQuestions;

import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenThreads {

    public static void main(String[] args) {
        OddEvenThreads oddEvenThreads = new OddEvenThreads();
        oddEvenThreads.rud();

    }


    public void rud() {


        AtomicInteger i = new AtomicInteger();
        i.set(0);
        Thread r1 = new Thread(
                () -> {

                    synchronized (this) {

                        while(i.get() <= 20) {

                            while (i.get() % 2 ==0) {
                                System.out.println("thread 1 " + i);
                                try {
                                    wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                            i.incrementAndGet();
                            notify();

                        }


                    }


                }
        );

        Thread r2 = new Thread(
                () -> {


                    synchronized (this) {
                        while(i.get() <= 20) {

                            while (i.get() % 2 !=0) {
                                System.out.println("thread 2 " + i);

                                try {
                                    wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                            i.incrementAndGet();
                            notify();

                        }
                    }


                }
        );

        r1.start();
        r2.start();



    }

}
