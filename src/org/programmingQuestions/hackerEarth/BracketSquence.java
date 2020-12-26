package org.programmingQuestions.hackerEarth;

import java.util.Stack;

public class BracketSquence {

    public static void main(String[] args) {
        String str = "()()()()";
        char[] arr = str.toCharArray();


        int counter = 0;
        char temp = 0;
        for (int i = 0; i < arr.length-1; i++) {

            if (i==0)
            temp = arr[i];


            arr[i] = arr[i+1];
            counter++;


        }

        arr[arr.length-1] = temp;

        counter++;
        System.out.println(counter/2);
        checkString(arr);

    }

    static int checkString(char[] arr) {
        Stack<Character> str = new Stack<>();

        for(char i: arr) {
            if(i == '(')
                str.push(i);
            else{
                str.pop();
            }
        }
        return str.size();
    }
}
