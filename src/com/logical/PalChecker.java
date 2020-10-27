package com.logical;

public class PalChecker {

    public static void main(String[] args) {
        String name = "rajaar";
        // raar
        char[] arr = name.toCharArray();

        int size = name.length();
        int current = size / 2;
        boolean isOddSize = size % 2 != 0;
        boolean isPalin = true;


        System.out.println(current);

        for(int i=0; ;i++) {

            if (isOddSize)
            {
                if (current + 1 + i <= size-1) {
                    if (arr[current + 1 + i] == arr[current -1 -i]) {

                    } else {
                        isPalin = false;
                        break;
                    }

                } else { break;}

            } else {

                if (current + i <= size-1) {
                    if (arr[current + i] == arr[current -i -1]) {


                    } else {
                        isPalin = false;
                        break;
                    }

                } else { break;}

            }
        }

        System.out.println(name +  " : " + isPalin);
    }

}
