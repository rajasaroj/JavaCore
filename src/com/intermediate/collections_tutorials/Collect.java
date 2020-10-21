package com.intermediate.collections_tutorials;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Collect {

    public static void main(String[] args) {

        HashSet a = new HashSet();
        a.add(null);
        a.add(null);
        System.out.println(a.add(null));

        HashMap hmap = new HashMap();

        hmap.put("hello", 1);
        hmap.put(true,2);
        hmap.put(null, null);


        System.out.println(hmap);

        /*
        if you add a dupicate key in map
        Map will override its value with the newer one
         */
        System.out.println(hmap.put("RajaCompany", "Morningstar"));
        /*
        After overriding the value the put method will return the older value of map
        in this case "Morningstar"
         */
        System.out.println(hmap.put("RajaCompany", "Google"));
        /*
        When we inspect the value for that particular key using get method you will get latest value
        in this case "Google"
         */
        System.out.println(hmap.get("RajaCompany"));

//        hmap.remove(null);
//        hmap.get(null);
//
//        Iterator it;
//
//        ConcurrentHashMap at;

        ArrayList b = new ArrayList ();
        b.add("aba");
        b.add("bba");
        b.add("cba");

        System.out.println(b);

        List ab =  Collections.unmodifiableList(b);

        b.add("a");
        System.out.println(ab);

    }
}
