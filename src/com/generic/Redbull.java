package com.generic;

import java.util.ArrayList;
import java.util.List;

class Grandparent {
    String name;

    @Override
    public String toString() {
        return "Grandparent{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Parent extends Grandparent{
    String name;

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                '}';
    }
}

class  Child extends Parent{
    String name;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }
}


class Container<T extends Parent> {

    T value;

    public void demo (List<? super Parent> parentList)
    {
        Child c = (Child) value;
        parentList.add(c);
        System.out.println(parentList.get(0));
    }

}



public class Redbull {



    public static void main(String[] args) {
        Container<Child> c = new Container();
        c.value = new Child();
        c.value.name = "I am child";
        c.demo(new ArrayList<Grandparent>());
        //c.value = new


    }
}
