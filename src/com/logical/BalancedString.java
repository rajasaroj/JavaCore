package com.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        boolean doneobve = false;

        map.put("{", "}");
        map.put("[", "]");
        map.put("(", ")");

        Stack<String> stack = new Stack<>();

        //String str = "({()})";
        String str = "{{{";

        if (str.length() % 2 != 0) {
            System.out.println("false");
        }

        char[] a = str.toCharArray();

        for ( char ar: a ) {

            String val = Character.toString(ar);

            if (map.keySet().contains(val)) {
                stack.push(val);
                System.out.println(stack + " : "+ val);

            } else if (map.values().contains(val)) {
                System.out.println(stack + " : "+ val);

                try {
                    stack.pop();
                } catch (Exception e) {
                    doneobve = true;
                    continue;
                }


            }
        }



        if (!doneobve) {
            if(stack.size() == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }


    }
}
