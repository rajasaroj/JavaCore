package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Joker {
    public static void main(String[] args) {

        try {
            dog();
        } catch (IOException | NullPointerException e) {
            //e = new Exception("");
            System.out.println(e);
        } catch (RuntimeException e) {

        } catch (Exception e) {

        }


    }

    static void dog() throws FileNotFoundException, IOException, NullPointerException {
        throw new FileNotFoundException();
    }
}
