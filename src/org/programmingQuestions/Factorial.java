package org.programmingQuestions;

public class Factorial {

    public static void main(String[] args) {
        int a = 4;

        int sum = 1;

        while (a != 0) {
            if ((a - 1) != 0) {
                sum = sum * a;
            }
            a--;
        }
        // 5 . 4. 3. 2. 1
        System.out.println(sum);

    }

}
