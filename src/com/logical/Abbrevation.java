package com.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Abbrevation {



    public static void main(String[] args) {
        String a = "ababbaAbAB";
        String b = "AABABB";

        AtomicBoolean pass = new AtomicBoolean(true);

        Map<Character, Integer> map = new HashMap<>();

        for (Character c: a.toCharArray()) {
            map.put(c, 0);
        }

        for (int i = 0; i < b.length(); i++) {

            Character c = b.charAt(i);

            if(map.containsKey(c)) {
                map.put(c, 2);
            } else if (map.containsKey(Character.toLowerCase(c))) {
                map.put(Character.toLowerCase(c), 1);
            } else {
                System.out.println("NO");
            }

        }

        System.out.println(map);
        map.entrySet().forEach((x) -> {
            if (Character.isUpperCase(x.getKey()) && (x.getValue() == 0)) {
                pass.set(false);
            }

            System.out.println(x.getKey() + " : " + x.getValue());
        });

        if(pass.get())
        System.out.println("Yes");



    }


}
