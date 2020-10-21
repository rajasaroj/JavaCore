package com.company.file_handling;

import java.io.Serializable;

public class Parent implements Serializable {
    int parentId =1;
    String parentName = "P1";

    @Override
    public String toString() {
        return "Parent{" +
                "parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                '}';
    }
}
