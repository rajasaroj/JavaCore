package com.logical;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HourGlasses {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sizeWindow =3;
        List<Integer> bigList = new ArrayList<>();
        List arrkeeperList = new ArrayList();
        int movement = arr[0].length -sizeWindow + 1;



        arrkeeperList.add(arr[0]);
        arrkeeperList.add(arr[1]);
        arrkeeperList.add(arr[2]);
        arrkeeperList.add(arr[3]);
        arrkeeperList.add(arr[4]);
        arrkeeperList.add(arr[5]);

        while (arrkeeperList.size() >= 3) {

            for (int i =0; i< movement; i++) {
                int hourglasssum = 0;

                int[] ar0 = Arrays.copyOfRange((int[]) arrkeeperList.get(0), i, i+sizeWindow);  ;

                    hourglasssum  = hourglasssum + Arrays.stream(ar0).sum();

                int[] ar1 = Arrays.copyOfRange((int[]) arrkeeperList.get(1), i, i+sizeWindow);  //(int[]) arrkeeperList.get(1);
                    hourglasssum = hourglasssum + ar1[1];

                int[] ar2 = Arrays.copyOfRange((int[]) arrkeeperList.get(2), i, i+sizeWindow);  //(int[]) arrkeeperList.get(2);
                    hourglasssum = hourglasssum + Arrays.stream(ar2).sum();


            bigList.add(hourglasssum);
            //System.out.println(bigList);
            }

            arrkeeperList.remove(0);
        }

        //System.out.println(bigList);
        return Collections.max(bigList);
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


        String st = "UUUDDDDDDUUU";

       int[][] arr=  {{1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0},
                    {0, 0, 2, 4, 4, 0},
                    {0, 0, 0, 2, 0, 0},
                    {0, 0, 1, 2, 4, 0}};

        int result = hourglassSum(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

    }

}
