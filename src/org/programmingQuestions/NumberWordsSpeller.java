package org.programmingQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberWordsSpeller {



    public static void main(String[] args) {
        Map<Character, String> stringUnitMap = new HashMap<>();
        stringUnitMap.put('0',"zero");
        stringUnitMap.put('1',"one");
        stringUnitMap.put('2',"two");
        stringUnitMap.put('3',"three");
        stringUnitMap.put('4',"four");
        stringUnitMap.put('5',"five");
        stringUnitMap.put('6',"six");
        stringUnitMap.put('7',"seven");
        stringUnitMap.put('8',"eight");
        stringUnitMap.put('9',"nine");


        Map<String, String> stringTensMap = new HashMap<>();
        stringTensMap.put("10","ten");
        stringTensMap.put("11","eleven");
        stringTensMap.put("12","twelve");
        stringTensMap.put("13","thirteen");
        stringTensMap.put("14","forteen");
        stringTensMap.put("15","fifteen");
        stringTensMap.put("16","sixteen");
        stringTensMap.put("17","seventeen");
        stringTensMap.put("18","eighteen");
        stringTensMap.put("19","nineteen");
        stringTensMap.put("20","twenty");
        stringTensMap.put("30","thirty");
        stringTensMap.put("40","forty");
        stringTensMap.put("50","fifty");
        stringTensMap.put("60","sixty");
        stringTensMap.put("70","seventy");
        stringTensMap.put("80","eighty");
        stringTensMap.put("90","ninety");
        stringTensMap.put("100","hundred");
        stringTensMap.put("1000","thousand");
        stringTensMap.put("1000000","million");
        stringTensMap.put("100000000","billion");

        Map<String, String> stringHighMap = new HashMap<>();
        stringHighMap.put("1000","thousand");
        stringHighMap.put("1000000","million");
        stringHighMap.put("100000000","billion");

        int num = 123456;

        String a = Integer.toString(num);

        char[] atr = a.toCharArray();

        int tne = 1;

        List<String> str = new ArrayList<>();
        for (int i = atr.length-1; i >= 0; i--) {


           //System.out.println(atr[i] + " " + tne + " " + stringUnitMap.get(atr[i]));
            if (tne == 1) {
                str.add(stringUnitMap.get(atr[i]));
            } else if (tne == 10) {

                Integer at =Integer.parseInt(String.valueOf(atr[i])) * tne;

                str.add(stringTensMap.get(at.toString()));
                System.out.println(str);
            } else {

                int numba = (int) Math.pow(10, atr.length - i-1);
                String numstr = Integer.toString(numba);
                String ad = stringUnitMap.get(atr[i]) + " " + stringTensMap.get(numstr);
                str.add(ad);
                System.out.println(str);

            }



            tne = tne* 10;
        }

    }
}
