package com.logical;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayManipulator {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries, int m) {


        int[] arr = new int[n+1];


        for(int i=0; i<m; i++) {

            int a_val = queries[i][0];
            int b_val = queries[i][1];
            int k_val = queries[i][2];

            arr[a_val-1] += k_val;

            for (int a: arr) {
                System.out.print(a + " , ");
            }
            System.out.println();


            if(b_val+1 <= n)
            arr[b_val+1] -= k_val;

        }

        long max = 0;
        long it=0;


        for (int i=0; i<arr.length; i++) {

            it = it + arr[i];

            if (it > max)
                max += arr[i];
        }

        System.out.println(max);
        return max;

    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }

        //int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        //int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        //int[] ar = {1, 1};


/*        int[][] arr = {{1, 5, 3},
                       {4, 8 ,7},
                       {6 ,9 ,1}};*/

        int[][] arr = {{1, 2, 100},
                {2, 5 ,100},
                {3 ,5 ,100}};

//        int[][] arr = {{2, 6, 8},
//                {3, 5, 7},
//                {1, 8, 1},
//                {5, 9, 15}};


        int result = (int) arrayManipulation(5, arr,3);
        System.out.println(result);


    }

}
