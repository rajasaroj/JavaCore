package com.company.access_mod_tutorials;

public class Child extends Parent {
    Child() {
        System.out.println("I m child");
        //Child c = new Child();
    }

    public static Child giveBirth()
    {
        return new Child();
    }


}

class Family {
    public static void main(String args[]) {
        Child.giveBirth();
    }
}