package com.logical;

import java.util.Arrays;

public class MinimumCoinDPP {

    public static void main(String[] args) {
        int target = 18;
        int[] dpparray = new int[target + 1];
        Arrays.fill(dpparray, -1);
        dpparray[0] = 0;

        int[] a = {1, 7, 5};

        int aa = minCoin(target, a, dpparray);
        System.out.println(aa);

        for(int i: dpparray) {
            System.out.print(i + ", ");
        }


    }

    static int minCoin(int n, int[] arr, int[] dp) {

        if (n == 0) return 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (n - arr[i] >= 0) {

                int subAns = -1;

                if (dp[n - arr[i]] != -1) {
                    subAns = dp[n - arr[i]];
                } else {
                    subAns = minCoin(n - arr[i], arr, dp);
                }


                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }

        dp[n] = ans;

        return ans;
    }

}
