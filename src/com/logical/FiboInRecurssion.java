package com.logical;

import java.util.Arrays;

public class FiboInRecurssion {

    public static void main(String[] args) {

        int[] dp = new int[6];
        Arrays.fill(dp,-1);

        fibo(5, dp);

        for (int i: dp) {

            if(i != -1)
            System.out.print(i + ", ");

        }
    }

    public static int fibo(int a, int[] dp) {


        if (a == 1 ) {
            return 1;
        }

        if (a==0) {
            return 0;
        }

        int sum=0;
        if (dp[a] !=-1) {
            sum = dp[a];
        } else {
            sum = fibo(a-1, dp) + fibo(a-2, dp);
        }

        System.out.println(sum);

        dp[a] = sum;
        return sum;

    }
}
