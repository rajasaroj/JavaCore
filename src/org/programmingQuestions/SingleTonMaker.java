package org.programmingQuestions;


class Student {

    private static Student instance;

    private Student() {}


    public static Student getInstance() {

        if (Student.instance == null) {

            synchronized (Student.class) {

                if (instance == null)
                instance = new Student();

                return instance;
            }

        } else {
            return instance;
        }

    }

}

public class SingleTonMaker {
    public static void main(String[] args) {

        if (Student.getInstance() == Student.getInstance()) {
            System.out.println("True");
        }
    }
}
