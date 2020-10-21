package com.company.cloning_tutorials;

import java.util.stream.Collectors;

class Student implements Cloneable{
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

public class Cloner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "Amit");
        Student s2 = s1.clone();
        Collectors s;
        System.out.println(s1);
        s1.name = "Dusada";
        System.out.println(s2);
        System.out.println(s1);
    }
}
