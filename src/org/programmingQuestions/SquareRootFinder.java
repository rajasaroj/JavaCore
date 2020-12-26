package org.programmingQuestions;

public class SquareRootFinder {

    public static void main(String[] args) {

        int a = 225;
        int test = 1;
        while (true) {
            if (test * test == a) {
                System.out.println(test);
                break;
            }

            if (test * test > a) {
                break;
            }
            test++;
        }
        System.out.println(test);
    }
}
