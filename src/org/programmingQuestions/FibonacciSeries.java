package org.programmingQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=5;


        int curr_sum = 1;
        int prev_sum = 0;
        int print_var;

        for (int i=0; i<12; i++) {


            if (i<=1) {
                System.out.println(i);
            } else
            {
                print_var = curr_sum + prev_sum;
                System.out.println(print_var);
                prev_sum = curr_sum;
                curr_sum = print_var;
            }



        }

    }
}
