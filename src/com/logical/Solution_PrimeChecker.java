package com.logical;

import java.util.ArrayList;
import java.util.List;

class Prime {


    public static List<Integer> checkPrime2(int a) {

        List<Integer> lst = new ArrayList<>();

        for (int i = 2; i <= a; i++) {

            if (helper_optimizer(i)) {
                lst.add(i);
            }

        }

        return lst;
    }

/*    public static boolean helper(int a) {
        boolean isPrime = true;

        for (int i = 2; i <= a / 2; i++) {

            if (a % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }*/



    // Optimized version
    public static boolean helper_optimizer(int a) {

        if (a == 2) {
            return true;
        }

        if (a < 2 || a % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= (int) Math.sqrt(a); i += 2) {

            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


    public int checkPrime(int... a) {

        for (int i : a) {
            System.out.println(checkPrime2(i));
        }
        return 0;
    }


}

public class Solution_PrimeChecker {

    public static void main(String[] args) {
        Prime p = new Prime();
        p.checkPrime(2, 1, 3 , 4 ,5 );

        class a {

        }

        a v = new a();
    }
}
