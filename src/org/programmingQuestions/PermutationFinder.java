package org.programmingQuestions;

public class PermutationFinder {



    public static void main(String[] args) {
        String str = "geek";
        perma(str, "");
    }


    static void perma(String ad, String ans) {

        if(ad.equals("") || ad.length() ==0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ad.length(); i++) {

            // Select only the ith character in r and save remaining string in rus variable
            String r = String.valueOf(ad.charAt(i));
            String rus = ad.substring(0, i) + ad.substring(i+1);
            //System.out.println("r: " + r + " rus: " + rus);

            // its will automatically rearrange characters.
            perma(rus, ans+r);

        }

    }
}
