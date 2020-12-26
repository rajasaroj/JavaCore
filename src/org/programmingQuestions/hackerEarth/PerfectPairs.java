package org.programmingQuestions.hackerEarth;

import java.util.Arrays;
import java.util.Map;

public class PerfectPairs {

    /**
     * // Sort it array
     * list=[]
     * use to forloop
     * Loop i ---> n
     * 	loop j=i+1 to n
     * 	checkPerfectSquaresORCube(sum(a[i]+a[j]))
     * 	if true
     * 	add in list
     * 	else
     * 	continue.
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        checkSquareRoot(9);
        checkCubeRoot(8);

        String str = "1 2 3 4 5";
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter=0;
        for (int i=0; i< arr.length; i++) {

            for(int j = i+1; j< arr.length; j++) {
                int a = arr[i];
                int b = arr[j];

//                if(checkSquareRoot(a+b) || checkCubeRoot(a+b)) {
//                    counter++;
//                }

                if(  (((Math.sqrt(a+b) * 10) % 10)  == 0.0 )  || (((Math.cbrt(a+b) * 10) % 10)  == 0.0) ) {
                    counter++;
                }
            }

        }
        System.out.println(counter);

    }

    public static boolean checkSquareRoot(int sum) {

        Double ab =  Math.sqrt(sum);
        Double op = (ab*10) % 10;

        return op == 0.0;
    }

    public static boolean checkCubeRoot(int sum) {

        double ab =  Math.cbrt(sum);
        Double op = (ab*10) % 10;

        return op == 0.0;
    }
}
