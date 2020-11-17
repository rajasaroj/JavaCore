package com.logical;

public class Yaaar {


    public static void main(String[] args) {

        int[] Q = {1, 2, 5, 3, 7, 8, 6, 4};

        int mmax=0;

/*
        for (int i=0; i<Q.length; i++) {
            Q[i] = Q[i]-1;
        }
*/
        //Math.max()
        for(int i=0; i<Q.length; i++) {

            int P = Q[i]-1;

            if (P-i >2) {
                System.out.println("overflow");

            } else {


                for (int j=0; j<i; j++) {
                    if (Q[j] > P) {
                        mmax++;
                    }
                }
            }

        }


        System.out.println(mmax);




























































    }
}
