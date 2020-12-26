package org;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// https://www.geeksforgeeks.org/how-to-create-a-java-hashmap-of-user-defined-class-type/

public class HashMapOverrideSolution {

    public static class Student {

        private  String sName;
        private final int sRollno;
        private String sSubject;

        public Student(String sName, int sRollno) {
            this.sName = sName;
            this.sRollno = sRollno;
        }

        public Student(String sName, int sRollno, String sSubject) {
            this.sName = sName;
            this.sRollno = sRollno;
            this.sSubject = sSubject;
        }

        public String getsName() {
            return sName;
        }

        public int getsRollno() {
            return sRollno;
        }

        public String getsSubject() {
            return sSubject;
        }

        public void setsName(String sName) {
            this.sName = sName;
        }

        public void setsSubject(String sSubject) {
            this.sSubject = sSubject;
        }

        @Override
        public boolean equals(Object o) {

            // Check Reference first
            if (this == o) {
                return true;
            }

            // Check Reference is null
            if (o == null) {
                return false;
            }

            // Check Class
            if (o.getClass() == this.getClass()) {
                return true;
            }

            Student std = (Student) o;

            // Check the final rollno
            if (std.sRollno != this.sRollno) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            final int seedPrime = 31;
            return 31 + this.sRollno;
        }
    }

    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();
        Student one = new Student("geeks", 1);
        Student two = new Student("geeks", 2);

        map.put(one, "Once");
        map.put(two, "twice");

        System.out.println(map.get(one));
        System.out.println(map.get(two));

        one.setsName("not geeks");
        two.setsName("not geeks");

        System.out.println(map.get(one));
        System.out.println(map.get(two));


        // This will overwrite the value of one->"once" with "Thrice changed once"
        // because according to the contract
        // if two object are same by .equal() (overriden to check rollno), then their hashcode should also be same.
        // in our case the hascode of object one and three is same because they have same rollno
        // hence map consider them as a same key and overwrite their values
        // Theoriotically the rollno should be non duplicate, primary and final. in order to perform best on map.
        Student three = new Student("not geeks", 1);
        map.put(three, "Thrice changed once");

        System.out.println("---------------");
        System.out.println(map.get(one));
        System.out.println(map.get(two));
        System.out.println(map.get(three));
    }
}
