package com.company.covariant_classes;


/*
    Covariant Explaination:
    if Nehru is the parent class and Rahul is the child class
    the overriden (child class overriden method) method return type should be child class of
    overriding method (parent class method)
 */

public class Nehru {

    // overriding method return type is parent class of all exceptions
    public Exception verb(){
        System.out.println("i am Nehru");
        return new Exception();
    }
}
