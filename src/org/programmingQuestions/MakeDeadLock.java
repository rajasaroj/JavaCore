package org.programmingQuestions;

public class MakeDeadLock {


    /** T1 locks
     *  resource 1
     *  and Tries to lock resource 2
     *
     *  T2 locks  resource 2
     *  and Tries to lock resource 1
     *
     *  Deadlock happened!!!
     *  link: https://www.javatpoint.com/deadlock-in-java
     * @param args
     */

    public static void main(String[] args) {
         String resource1 = "Raja";
         String resource2 = "Soham";

         Thread t1 = new Thread(
                 () -> {
                     synchronized (resource1) { System.out.println("THread1 locked reosuce 1");

                         try {
                             Thread.sleep(100);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }

                         synchronized (resource2) { System.out.println("THread1 locked reosuce 2"); }


                     }
                 });


        Thread t2 = new Thread(
                () -> {
                    synchronized (resource2) { System.out.println("THread2 locked reosuce 2");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (resource1) { System.out.println("THread2 locked reosuce 1"); }


                    }
                });

         t1.start();
         t2.start();
    }
}
