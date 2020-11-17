package com.logical;

import java.io.IOException;

public class TravelValleyCounter {

    public static int countingValleys(int steps, String path) {

        // Write your code here
        int count = 0;
        int valleyCounter=0;

        char[] arr = path.toCharArray();

        for (int i=0; i<arr.length; i++) {

            if (arr[i] == 'U') {

                if (count < 0) {
                    // below sea level
                    count++;
                } else if(count > 0) {
                    // above sea level
                    count++;
                } else {
                    // Sea level
                    count++;
                    //valleyCounter++;
                }

            } else {

                if (count < 0) {
                    // below sea leve
                    count--;

                } else if(count > 0) {
                    // above sea level
                    count--;

                } else {
                    // Sea level
                    valleyCounter++;
                    count--;
                }

            }

        }

        // if U uphill
        // if J downValley
        return valleyCounter;
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

        int step = 12;
        String st = "UUUDDDDDDUUU";


        int result = countingValleys(step, st);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

    }


}
