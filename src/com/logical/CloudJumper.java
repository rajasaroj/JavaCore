package com.logical;

import java.io.IOException;

public class CloudJumper {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int totalJumps=0;
        boolean shouldLongjump = false;

        for (int i=0; i< c.length; ) {

            // take 2 jump if no thunder
            int jumpsize = i + 2;

            if (jumpsize < c.length) {

                if(c[jumpsize] != 1) {
                    shouldLongjump = true;
                } else {
                    shouldLongjump = false;
                }

            } else {
                shouldLongjump = false;
            }

            if(i >= c.length)
                break;

            if (shouldLongjump) {
                i = i + 2;
                totalJumps++;
            } else {
                i++;
                totalJumps++;
            }

        }
        --totalJumps;

    return totalJumps;
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


        //int[] ar = {0, 0, 0, 0, 1, 0};
        int[] ar = {0 ,0 ,0 ,1 ,0 ,0};


        int result = jumpingOnClouds(ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

    }


}
