package com.company.interface_tutorails;

interface myIntf {

    default void sing() {
        System.out.println("s1");
    }

    static void m1() {
        System.out.println("s2");
    }
}

interface myIntf2 {

    default void sing() {
        System.out.println("s1");
    }

    static void m1() {
        System.out.println("s2");
    }
}


public class TeestMultipleInterfaceSameDefaultMethods implements myIntf,  myIntf2 {

    public static void main(String[] args) {

        myIntf.m1();

    }

    @Override
    public void sing() {

    }
}
