package com.logical;

import java.io.IOException;

public class Repeater {

    static long repeatedString(String s, long n) {
        Long size = n;
        String app_str = "";
        long totalCounter= 0;



        if(s.equals("a") && s.length() == 1) {
            return n;
        }


            long a_count_in_og = 0;
            char[] s_og = s.toCharArray();
            for(int i=0; i < s_og.length; i++) {
                if(s_og[i] == 'a') {
                    a_count_in_og++;
                }
            }

        System.out.println("a count from og "+ a_count_in_og);

            long total_batches = n / s.length();
            totalCounter = total_batches * a_count_in_og;
            long remainder = n % s.length();

        //System.out.println("total batcher:  "+ total_batches);
        //System.out.println("totalcounter:  "+ totalCounter);
        //System.out.println("remainder:  "+ remainder);


            for(int i=0; i < remainder; i++) {
                if(s_og[i] == 'a') {
                    totalCounter++;
                }
            }

        return totalCounter;
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
        //int[] ar = {0 ,0 ,0 ,1 ,0 ,0};

        String s = "aba";
        long n = 10;

        long result = repeatedString(s, n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

    }
}
