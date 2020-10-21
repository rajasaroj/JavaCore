package com.company.static_tutorials;

public class Admin {

    public static void main(String args[]) {


        /*
        Static class can only be created in nested class
        and you just have to use the name of outter User class to access the static class
         */
        User.VipUser a = new User.VipUser();
        a.greet();

        /*
        Inner nested class can only be accessed and instantiated after creating the object
        of outer class
        Now you can use the object of outer class to instantiate inner class
         */
        User us = new User();
        User.NormalUser nus = us.new NormalUser();
        nus.greet();

    }
}
