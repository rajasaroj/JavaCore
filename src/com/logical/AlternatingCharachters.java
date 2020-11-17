package com.logical;

import java.util.ArrayList;

public class AlternatingCharachters {

    public static void main(String[] args) {
        String s = "AABAAB";
        int count=0;

        for (int i=0; i<s.length(); ) {

            int j= i;
            char a = s.charAt(i);


            System.out.println("inta a: " + a );
            while (++j < s.length() && (s.charAt(j) == a) ) {
                count++;
                //System.out.println(a + " : " + s.charAt(j) + " count: " + count);
                //System.out.println(count);
            }

            if(j == s.length())
                break;
            else
                i=j;



        }


    }
}
