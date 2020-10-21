package com.company.file_handling;

public class child2 extends Parent{
    int childId = 2;
    String childName = "C2";

    @Override
    public String toString() {
        return "child2{" +
                "childId=" + childId +
                ", childName='" + childName + '\'' +
                ", parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                '}';
    }
}
