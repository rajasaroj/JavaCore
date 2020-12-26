package org.programmingQuestions.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Algorithm For Mirco and toys
 * for given k
 * and array a
 * take the minimum value of a and subtract by k
 * k-a = ans
 * the ans will be the lowest amount of time taken to update
 */

public class MicroAndArrays {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<String> inp = new ArrayList();
        while (s.hasNext()) {
            inp.add(s.nextLine());
        }

        Iterator<String> itr = inp.iterator();
        itr.next();


        while (itr.hasNext()) {
            int twoValue[] = Arrays.stream(itr.next().split(" ")).mapToInt(Integer::parseInt).toArray();

            int k = twoValue[1];

            int[] arr = Arrays.stream(itr.next().split(" ")).mapToInt(Integer::parseInt).toArray();

            Arrays.sort(arr);

            int ans = k - arr[0];

            if (ans >= 0)
                System.out.println(ans);
            else
                System.out.println(0);
        }
    }
}
