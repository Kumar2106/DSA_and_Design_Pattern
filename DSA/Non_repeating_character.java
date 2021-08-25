package DSA;

import java.util.HashMap;

public class Non_repeating_character {
    public static void main(String[] args) {
       String s = "zxvczbtxyzvy";
       System.out.print("First non repeating character in the string is "+ first_non_repeating_character(s)); 
    }

    public static char first_non_repeating_character(String s){
        int length = s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<length; i++){
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<length; i++){
           if(map.get(s.charAt(i)) == 1){
               return s.charAt(i);
           }
        }

        return '$';
    }
}
