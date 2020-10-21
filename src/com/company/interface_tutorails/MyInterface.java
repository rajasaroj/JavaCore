package com.company.interface_tutorails;

public interface MyInterface {

    // Note: by default this attribute is final you cant change it!!!
    int a = 100;
    void printer();
    default String singer(){
        return "Sare gama paa";
    }
}
