package Arraynstring;

public class CheckPermutation {

    public static boolean checkPermutation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        //Assuming string are encoded in ASCII characters
        int[] letters = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            letters[s1.charAt(i)]--;

            if (letters[s2.charAt(i)] < 0)
            return false;
        }
    

        return true;

    }

    public static void main(String[] args) {
        String s1 = "dog";
        String s2 = "god";

        System.out.println("Strings are permutation of each other : " + checkPermutation(s1, s2));


    }
}
