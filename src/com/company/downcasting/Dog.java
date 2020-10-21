package com.company.downcasting;

class Animals {}
public class Dog extends Animals {

    public void dk() {}

    public static void bark (Animals animal) {
        Dog d = (Dog) animal;
        d.dk();
    }

    public static void main(String args[]) {
        Animals d = new Dog();
        Dog.bark(d);


    }
}
