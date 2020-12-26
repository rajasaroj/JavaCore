package org.programmingQuestions;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Soham";

        char[] arr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = arr.length-1; i >= 0; i--) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(stringBuilder);

    }

}
