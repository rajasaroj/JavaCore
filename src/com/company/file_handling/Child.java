package com.company.file_handling;

import java.io.Serializable;

public class Child extends Parent  {
    int childId = 1;
    String childName = "C1";

    @Override
    public String toString() {
        return "Child{" +
                "childId=" + childId +
                ", childName='" + childName + '\'' +
                '}';
    }
}
