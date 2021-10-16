package DSA.Bit_Magic_Advance;

import java.util.ArrayList;
import java.util.Collections;

public class Possible_word {
    public static void main(String[] args) {
        int a[]={2,3,4};
        int N = a.length;
        ArrayList<String> output = possibleWords(a, N);
        for(int i=0; i<output.size(); i++){
           
            System.out.print(output.get(i)+" ");
        }
    }
    //Function to find list of all words possible by pressing given numbers.
    static String keypad[] = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
          ArrayList<String> result = words(a, 0, N);
          return result;
    }
    
    static ArrayList<String> words(int a[], int index, int end){
        if(index>=end){
            ArrayList<String> basecase = new ArrayList<>();
            basecase.add("");
            return basecase;
        }
        
        ArrayList<String> reRes = words(a,index+1,end); 
        for(int i=0; i<reRes.size(); i++){
            System.out.print(reRes.get(i)+" ");
        }

        ArrayList<String> myres = new ArrayList<>();
        
        String curr = keypad[a[index]];
        
        for(int i=0; i<curr.length(); i++){
            char ch = curr.charAt(i);
            
            for(String rs: reRes){
                myres.add(ch+rs);
            }
        }

        for(int i=0; i<myres.size(); i++){
            System.out.print(myres.get(i)+" ");
        }
        
        return myres;
    }
    
    
}
