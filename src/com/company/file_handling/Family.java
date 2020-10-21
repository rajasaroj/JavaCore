package com.company.file_handling;

import java.io.*;

public class Family {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileOutputStream fos = new FileOutputStream("lafamilia3");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Parent c = new child2();
        oos.writeObject(c);
        oos.close();

        FileInputStream fis = new FileInputStream("lafamilia3");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Parent c2 = (child2) ois.readObject();
        System.out.println(c2);
        ois.close();

    }
}
