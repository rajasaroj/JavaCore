package com.java8features;


class Grandparent {
    String name;



    @Override
    public String toString() {
        return "Grandparent{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Parent extends Grandparent {
    String name;

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                '}';
    }
}

class  Child extends Parent {
    String name;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface MyInterface {
    void display(Child g);

}

class Printer {
    public Child paint(Grandparent g) {
        System.out.println("Instance methpd");
        return  new Child();
    }
}

public class Bumbulbee {
    public static void main(String[] args) {
        Printer p = new Printer();
        MyInterface ref = p :: paint;
       // ref.display(new Child());
    }
}
