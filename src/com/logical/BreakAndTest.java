package com.logical;

public class BreakAndTest {
    public static void main(String[] args) {

        System.out.println(dela());


    }

    public static int del() {
        while (true) {

            try {

                throw new Exception();

            } catch (Exception e) {
                System.out.println(e);
                break;

            } finally {
                return 2;

            }

        }


    }


    public static int dela() {
        while (true) {

            try {


                return 4;


            } finally {
                System.out.println(40);
                break;
            }

        }

        return 3;
    }
}
