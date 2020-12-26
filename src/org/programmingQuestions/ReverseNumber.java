package org.programmingQuestions;

import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseNumber {

    public static void main(String[] args) {
        Integer num = 123001;

        int sum = 0;
        while (num !=0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum * 10 + rem;
        }
        System.out.println(sum);
    }

}
