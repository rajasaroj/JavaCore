package org.programmingQuestions;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 372;
        int actual = num;

        int sum=0;
        while(num!=0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }

        if (sum == actual)
            System.out.println("its Amstrong");
    }
}
