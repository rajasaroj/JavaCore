package com.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagrams {

    public static void main(String[] args) {
        String a = "cde";   // 3
        String b = "dcf";   // 3


        String rp = b;
        for (int i=0; i<a.length(); i++) {


            char replacer = a.charAt(i);
            int intial_len = rp.length();

            rp = rp.replaceFirst(Character.toString(replacer), "");
        }

        int min = a.length() - (b.length() - rp.length());
        min = min + rp.length();



        System.out.println(min);

    }
}
