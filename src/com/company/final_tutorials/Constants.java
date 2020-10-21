package com.company.final_tutorials;

import java.util.ArrayList;
import java.util.Collections;

public final class Constants {


    public static void main(String args[]) {
        final ArrayList a1 = new ArrayList();
        a1.add(100);
        a1.add("sarwa");
        a1.add(true);

        Collections.unmodifiableList(a1);

        ArrayList b1 = new ArrayList();

        a1.add("sdf");


        System.out.println(a1);
    }

}
