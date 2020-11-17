package com.logical;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MinSwap {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int swapcount = 0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        boolean[] booleans = new boolean[arr.length];

        for (int i=1; i <= arr.length; i++) {
            hashmap.put(i, arr[i-1]);
            booleans[i-1] = false;
        }

        for (int i=0; i < hashmap.size(); i++) {

          int point_val = i+1;
          int value = hashmap.get(point_val);

          if( !booleans[i] ) {

              if (point_val == value) {
                  booleans[i] = true;
                  continue;

              } else {

                  booleans[i] = true;

                  while (!booleans[value-1]) {
                      swapcount++;
                      booleans[value-1] = true;
                      int next_val = hashmap.get(value);
                      value = next_val;

                  }

              }
          }
        }


        return swapcount;
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

        int [] a = {1 ,3 ,5 ,2 ,4 ,6 ,7};


        int result = minimumSwaps(a);

        System.out.println(result);
        System.out.println(1342);
        System.out.println();

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

    }
}
