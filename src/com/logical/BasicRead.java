package com.logical;

import org.omg.Messaging.SyncScopeHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicRead {

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input */



        System.out.println("enter number");
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();                // Reading input from STDIN

        //String[] ab = number.split(" ");

/*
        long aa = Long.parseLong(ab[0].trim());
        long bb = Long.parseLong(ab[1].trim());


        long a = aa;
        long b= bb;

        long a_mag = a;
        long b_mag = b;


        long min=0;
*/

        char[] ab = number.toCharArray();

        List biglist = new ArrayList();

        List currentlidyt = new ArrayList<>();

        for (int i=0; i< ab.length; i++) {




        }



    }
}
