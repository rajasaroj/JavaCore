package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UNcheck {

    public static void main(String[] args)  {
        UNcheck a = new checker();
        a.start();

        try{
        a.stop();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e = new IOException();
            e.printStackTrace();
        }
    }

    public void start() throws  NullPointerException {}

    public void stop() throws IOException {

    }
}

class checker extends UNcheck {
    @Override
    public void start() throws NullPointerException {
        System.out.println("yes");
    }

    @Override
    public void stop() throws FileNotFoundException {
        System.out.println("chile");
    }
}
