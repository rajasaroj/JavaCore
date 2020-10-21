package com.company.static_tutorials;

public class MasterClass implements PrincpleClass {

    int a = 10;
    int b = 20;
    MasterClass() {}

    public static void main(String args[]) {
        int a = 50;

        MasterClass ab = new MasterClass();

        //PrincpleClass.teach();

    }


    @Override
    public void beat() {
        System.out.println("I beat students");
    }
}

class Student extends MasterClass {

    public void learn() {
        int ac = this.a;
        this.beat();
        PrincpleClass.teach();
    }

}


interface PrincpleClass {
    public static void teach() {
        System.out.println("i am the princple");
    }

    void beat();
}

