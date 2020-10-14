package Arraynstring;

public class HasAllUniqueCharacters {
    public static boolean hasAllUniqueCharacters(String s){
        if(s.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for(int i =0; i< s.length(); i++){
            int val = s.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {

        String inputString = "Hello";
        System.out.println(inputString + " has all unique characters: " +hasAllUniqueCharacters(inputString));

    }
}
