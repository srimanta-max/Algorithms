package Arraynstring;

import java.util.Random;

public class OneWay {
    

    public boolean OneEditAway(String first, String second){
        if(Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        //Determine shorter and longer string
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index2 < s2.length() && index1 < s1.length()) {

        }









    }

    public static String randomString(int seed) {
        Random rand = new Random(seed);
        StringBuilder sb = new StringBuilder();
        for(int i=0;;i++) {
            int n = rand.nextInt(27);
            if (n == 0) break;
            sb.append((char) ('`' + n));
        }
        return sb.toString();
    }


        public static void main(String[] args) {

            String s1 = "abc";
        String s2 = "ab";
        OneWay oneWay = new OneWay();
        System.out.println("Strings are one edit away: " + oneWay.OneEditAway());

        System.out.println( randomString(5));
    }
}
