package Arraynstring;

public class PermutationPalindrome {

    public boolean CheckIfPermutationOfPalindrome(String input) {

        int[] chars = new int[128];


        for(int i = 0; i< input.length(); i++){
            chars[input.charAt(i)]++;
        }
        int count = 0;
        for(int i =0; i<chars.length; i++){
            if(chars[i] % 2 != 0 ){
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {

        String input = "racecar";
        PermutationPalindrome permutationPalindrome = new PermutationPalindrome();
        System.out.println("Is input permutation of palindrome ? : "+ permutationPalindrome.CheckIfPermutationOfPalindrome(input));


    }
}
