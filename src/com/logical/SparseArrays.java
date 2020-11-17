package com.logical;

public class SparseArrays {

    public static void main(String[] args) {
/*        String[] a = { "aba", "baba", "aba", "xzvb"};
        String[] queries = {"aba", "xzvb", "ab"};*/

        String[] a = { "def", "de", "fgh"};
        String[] queries = {"de", "lmn", "fgh"};

        int[] counts = new int[queries.length];

        int idx=0;
        for (String q: queries) {

            int count=0;
            for(int i=0; i<a.length; i++) {

                if(q.equals(a[i])) {
                    count++;
                }
            }

            counts[idx] = count;
            idx++;
        }

        for(int i: counts)
        System.out.print(i + ", ");
    }
}
