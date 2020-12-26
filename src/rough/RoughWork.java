package rough;

import java.util.*;

interface Parent1 {
    void sing();
    default void dance() {
        System.out.println("parent 1 dance");
    }
}


interface Parent2 {
    void sing();
    default void dance() {
        System.out.println("parent 2 dance");
    }
}

interface avc extends Parent1, Parent2 {

    @Override
    default void sing() {


    }

    @Override
    default void dance() {

    }
}

public class RoughWork implements Parent1, Parent2 {
    @Override
    public void sing() {
        // abc
    }

    @Override
    public void dance() {
        System.out.println("child  dance");
    }

    public static void main(String[] args) {
        Parent1 parent1 = new RoughWork();
        parent1.dance();

        Parent2 parent2 = new RoughWork();
        parent2.dance();

        List l = new ArrayList<>();
        Iterator i = l.iterator();
        i.remove();

        Map<Integer, Integer> ll ;



        TreeMap<RoughWork, Integer> treeMap = new TreeMap();
        treeMap.put(new RoughWork(), 1);

    }
}
