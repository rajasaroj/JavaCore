package com.logical;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class SherlockString {

    public static String main(String[] args) throws IOException {

        File ats = new File("C:\\Users\\rsaroj\\IdeaProjects\\Junkie\\src\\com\\logical\\text.txt");
        BufferedReader bf = new BufferedReader(new FileReader(ats));
        //String s = bf.readLine();

        //String s = "aabbccddeefghi";
        String s = "aabbc";

        Map<Character, Integer> hashMap = new HashMap<>();

        for (char r : s.toCharArray()) {

            Integer i = hashMap.get(r);
            if (i == null) {
                hashMap.put(r, 1);
            } else {
                hashMap.put(r, ++i);
            }
        }

        int max_count = 0;
        int min_count = 0;

        Integer maxEntry = hashMap.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getValue();


        Integer minEntry = hashMap.entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getValue();

        minEntry = minEntry.intValue();
        maxEntry = maxEntry.intValue();

        for (Integer i : hashMap.values()) {
            if (maxEntry == i.intValue()) {
                max_count++;
            } else if (minEntry == i.intValue()) {
                min_count++;
            }
        }

        if (maxEntry - minEntry == 0) {
            System.out.println("true");
            return "YES";
        } else if (maxEntry - minEntry == 1) {


            if (max_count == 1) {
                System.out.println("true");
                return "YES";

            } else if (min_count == 1 && minEntry==1 && max_count == hashMap.size()-1) {
                System.out.println("true");
                return "YES";
            }    else {
                System.out.println("false");
                return "NO";
            }

        } else if (min_count == 1 && minEntry==1 && max_count == hashMap.size()-1) {
            System.out.println("true");
            return "YES";
        } else {
            System.out.println("false");
            return "NO";
        }

    }
}
