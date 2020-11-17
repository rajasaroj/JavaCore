package com.logical;

import java.io.IOException;
import java.util.Arrays;

public class RotaterLetft {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] cp_arr = new int[a.length];
        int idx = 0;

        for (int i=d; i< a.length ; i++) {
            cp_arr[idx] = a[i];
            idx++;
        }

        for (int i=0; i<d; i++) {
            cp_arr[idx] = a[i];
            idx++;
        }

        return cp_arr;
    }


    static int[] rotLeftonbyone(int[] a, int d) {

        for(int i=0; i<d; i++ ) {
            
            int temp = 0;
            for(int j=0; j< a.length; j++) {
                
                if (j==0)
                {
                    temp = a[j];
                    continue;    
                }
                
                a[j-1] = a[j];
                
            }
            a[a.length-1] = temp; 
            
        }
        

        return a;
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

        int [] a = {1, 2, 3, 4, 5};


        int[] result = rotLeftonbyone(a,2);

        for (int i: result){
            System.out.print(i);
            System.out.print(",");
        }

        System.out.println();

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

    }
}
