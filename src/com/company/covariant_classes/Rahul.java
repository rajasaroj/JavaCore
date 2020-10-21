package com.company.covariant_classes;

import java.io.IOException;

public class Rahul extends Nehru {

    // overriden method return type is child class of Exceptions class
    @Override
    public IOException verb() {
        return new IOException();
    }
}
