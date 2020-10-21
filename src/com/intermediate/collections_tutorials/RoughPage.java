package com.intermediate.collections_tutorials;

import java.util.*;

public class RoughPage {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] myArray = new String[100];
        for(int i = 0; i <= s.length()-k; i++){
            myArray[i] = s.substring(i,i+k);
        }
        int size = myArray.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<size; j++) {

                System.out.println(i);
                System.out.println(j);

                String a = myArray[i];
                String b = myArray[j];

                if(myArray[i].compareTo(myArray[j])>0) {
                    String temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        smallest = myArray[0];
        largest = myArray[myArray.length-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();

//        String s = "Raja";
//        int k = 4;
//
//        scan.close();
//
//        System.out.println(getSmallestAndLargest(s, k));

//        LinkedList<String> ll = new LinkedList<>();
//        ll.add("abc");
//        ll.add(2, "bts");
//
//        ArrayList a = new ArrayList<>();
//        a.add(0, "0");
//        System.out.println(ll);

        List<Laptops> laps = new ArrayList<>();
        laps.add(new Laptops(100000,40,"Apple"));
        laps.add(new Laptops(750000,90,"Dell"));
        laps.add(new Laptops(200000,30,"Compact"));
        laps.add(new Laptops(560000,45,"Windows"));
        laps.add(new Laptops(300000,35,"Banana"));

        Comparator<Laptops> compareOnPrice = (Laptops ob1 , Laptops ob2) -> {

            if (ob1.getPrice() < ob2.getPrice())
                return 1;
            else
                return -1;
        };

        System.out.println("---------Compare on Price-------------");

        Collections.sort(laps, compareOnPrice);

        for (Laptops at : laps) {
            System.out.println(at);
        }


        Comparator<Laptops> compareOnRam = (Laptops ob1 , Laptops ob2) -> {

            if (ob1.getRam() < ob2.getRam())
                return 1;
            else
                return -1;
        };


        System.out.println("\n---------Compare on Ram-------------");
        Collections.sort(laps, compareOnRam);

        for (Laptops at : laps) {
            System.out.println(at);
        }

        Iterator a = laps.listIterator();
    }
}
