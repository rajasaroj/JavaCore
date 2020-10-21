package com.company.interface_tutorails;

public class StudentSinger implements MyInterface {
    @Override
    public void printer() {
        System.out.println("I am printing from StudentSinger");
    }

    public static void main(String args[]){
        new StudentSinger().printer();
        System.out.println(MyInterface.a);
        System.out.println(new StudentSinger().singer());
    }
}
