package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


interface Animals<T> {

    public T mate();

    default void reproduce () {
        System.out.println("I reproduce");
    }

    static void eat() {
        System.out.println("I eat");
    }

}

class Doggy {
    String name;

    @Override
    public String toString() {
        return "Doggy{" +
                "name='" + name + '\'' +
                '}';
    }

    public void futurePlanning(Animals<Doggy> d) {
        System.out.println(d.mate());
    }
}



public class MasterClass{
    public static void main(String[] args) {
        List<Integer> as = new ArrayList();
        as.add(100);
        as.add(200);
        as.add(300);
        as.add(400);
        as.add(500);
        as.add(600);

        List bt = as.stream().map(a -> a/10).collect(Collectors.toList());
        System.out.println(bt);

        Animals<Doggy> asDog = () -> {
            Doggy newDoggy = new Doggy();
            newDoggy.name = "Honolulu";
            return newDoggy;
        };

        Doggy d2 = new Doggy();
        d2.futurePlanning(asDog::mate);

        Function<Integer, String> f = (x) -> { return "the Number is: " + x.toString(); };
        System.out.println(f.apply(3));

        Predicate<Integer> p  = x -> x==3;
        System.out.println(p.test(3));

    }






}
