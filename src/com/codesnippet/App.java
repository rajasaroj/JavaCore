package com.codesnippet;

class  Super {
    int index = 1;
}

public class App extends Super {

    App(int index) {


        index = index;
    }


    public static void main(String[] args) {

        StringBuffer aa = new StringBuffer("plus ");
        aa.trimToSize();
        System.out.println(aa);

        int _ = 1;

        App a = new App(10);

        System.out.println(a.index); // 1

    }
}
