package com.logical;

import java.io.*;

public class SpecialString {


    public static void main(String[] args) throws IOException {

        File ats = new File("C:\\Users\\rsaroj\\IdeaProjects\\Junkie\\src\\com\\logical\\specialstring.txt");
        BufferedReader bf = new BufferedReader(new FileReader(ats));
        String a = bf.readLine();

        //String a = "asasd";
        int counter = 0;

        // Windowing Logic
        for (int i=0; i<a.length(); i++) {

            int window = i+1;

            if (window == 1) {
                counter = a.length();
                continue;
            }

            for(int j=0; j < (a.length() - window) +1; j++) {
                String str = a.substring(j, j+window);

                //System.out.print(str + " , ");

                if (checkAllSame(str)) {
                    counter++;
                } else if (checkPalin(str)) {
                    counter++;
                }


            }
            System.out.println("i, remaining windows: "+ (a.length() - i));

        }
        System.out.println(counter);
    }

    public static boolean checkAllSame(String a) {

        if (a.length() > 1) {
            String b = a.replace(Character.toString(a.charAt(0)), "");
            return b.length() == 0;
        } else {
            return true;
        }
    }

    public static boolean checkPalin(String b) {
        int b_len = b.length();

        if (b_len % 2 == 1) {

            Character mid_char = b.charAt(b_len / 2);
            String new_str = b.replace(Character.toString(mid_char), Character.toString(b.charAt(0)));

            if (checkAllSame(new_str)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
