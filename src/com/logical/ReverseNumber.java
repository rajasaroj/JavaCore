package com.logical;

public class ReverseNumber {

    public static void main(String[] args) {
        int a = 5678900;
        int c=0;
        int mod_val = a % 10;
        int div_val = a / 10;
        int sum =0;
        do {

             mod_val = a % 10;

             if(mod_val==0) {
                 c++;
             }


             div_val = a / 10;

            System.out.println("mod " +mod_val);
            System.out.println("div "+div_val);
            a = div_val;
            sum = sum*10 + mod_val;


        } while (mod_val != 0 || div_val !=0);

        sum/=10;

        if (--c > 0) {
            sum = (int) (sum * Math.pow(10, c));
        }

        System.out.println(sum);
    }
}
