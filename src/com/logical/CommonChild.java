package com.logical;

import java.util.*;

public class CommonChild {

    public static void main(String[] args) {
        String a = "SHINCHAN" ;
        String b = "NOHARAAA" ;

/*
        List<Character> s = new ArrayList<>();
        List<Character> s2 = new ArrayList<>();

        for (Character c: a.toCharArray()) {

            if (!s.contains(c)) {
                s.add(c);
            }
        }
        for (Character c: b.toCharArray()) {

            if(!s2.contains(c)) {
                s2.add(c);
            }
        }

        for(int i=0; i<s.size(); i++) {

            if(s.get(i) == s2.get(i)) {

            }
        }
*/
        printAllPalindromes("abbaalla");

    }

    public static Set<CharSequence> printAllPalindromes(String input) {
        if (input.length() <= 2) {
            return Collections.emptySet();
        }
        Set<CharSequence> out = new HashSet<CharSequence>();
        int length = input.length();
        for (int i = 1; i <= length; i++) {
            for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
                if (input.charAt(j) == input.charAt(k)) {
                    out.add(input.subSequence(j, k + 1));
                } else {
                    break;
                }
            }
        }
        System.out.println(out);
        return out;
    }

}
