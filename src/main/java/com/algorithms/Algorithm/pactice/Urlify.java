package com.algorithms.Algorithm.pactice;

public class Urlify {



    public static void UrlifyWithSB(String s, int len){

        StringBuilder sb = new StringBuilder();

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ' && i < len-1){
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }

    public static String URLifyInPlace(String strs, int len){

        char[] chars = strs.toCharArray();
        if(chars ==  null) return "";

        //count spaces in the string
        int countSpaces = 0;
        for(int i =0; i< len-1; i++){
            if(chars[i] == ' '){
                countSpaces++;
            }

        }
        //Increase length to accomodate the added extra 2 space for each space
        int newLength = len - 1 + countSpaces * 2;

        //to avoid spaces at the end if provided array is greater than the new length then we will have extra space at the end.
        if(newLength + 1 < chars.length){
            chars[newLength + 1] = '\0';
        }


        // loop through array backwards replacing space with '%20'

        for(int i = len -1; i >= 0; i--) {

            if (chars[i] == ' ') {        //If the character at the hand is space
                chars[newLength] = '0';
                chars[newLength - 1] = '2';
                chars[newLength - 2] = '%';
                newLength -= 3;
            } else {                //If the character at hand is not space
                chars[newLength] = chars[i];
                newLength--;
            }



        }
        return new String(chars);

    }

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        UrlifyWithSB(s, 13);


        System.out.println("============ \n");

        System.out.println(URLifyInPlace(s,13));

       // isUniqueCharacters("Hello");

    }
}
