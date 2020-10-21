package com.company.string_tuturials;

import java.util.HashSet;
import java.util.Set;

public class StringHelper {

    public static Set<StringBuffer> permutationFinder(StringBuffer str){
        Set<StringBuffer> perm = new HashSet<>();

        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add(new StringBuffer(""));
            return perm;
        }

        char initial = str.charAt(0);
        StringBuffer rem = new StringBuffer().append(str.substring(1)); // Full string without first character
        Set<StringBuffer> words = permutationFinder(rem);
        for (StringBuffer strNew : words) {
            int l = strNew.length();
            for (int i = 0;i<=l;i++){
                //System.out.println("Intial: "+ initial);
                StringBuffer val = new StringBuffer().append(initial);
                //System.out.println(i);
                //System.out.println("initial (val) "+ val + " strNew "+ strNew);
                StringBuffer str_new_ns = new StringBuffer().append(strNew);
                StringBuffer sup =new StringBuffer().append(str_new_ns.insert(i,val));
                perm.add(sup);
                //System.out.println(perm);

            }
            //System.out.println("-----");
        }
        return perm;


    }



}
