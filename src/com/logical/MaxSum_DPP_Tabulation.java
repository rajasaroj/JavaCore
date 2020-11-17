package com.logical;

public class MaxSum_DPP_Tabulation {
    public static void main(String[] args) {

        int[] a = {-2, 1, 3, -4, 5};

        if (a.length==0) return;
        if (a.length==1) return;

        a[0] = Math.max(0, a[0]);
        a[1] = Math.max(a[0], a[1]);

        for (int i =2; i < a.length; i++) {
            a[i] = Math.max(a[i-1], a[i] + a[i-2]);
            display(a);
            System.out.println();
        }


        System.out.println(a[a.length-1]);
    }

    public static void display(int[] a) {
        for (int i : a) System.out.print(i+ ", ");
    }

}
