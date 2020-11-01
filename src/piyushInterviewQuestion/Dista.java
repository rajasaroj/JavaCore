package piyushInterviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class Dista {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("dog");
        a.add("cat");
        fileer(a);
        System.out.println(a);
    }

    public static void fileer(List a) {
        a = new ArrayList(a);
        a.add("sdfs");

    }
}
