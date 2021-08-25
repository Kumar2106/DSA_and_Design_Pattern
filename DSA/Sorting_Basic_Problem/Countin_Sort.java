package DSA.Sorting_Basic_Problem;

public class Countin_Sort {
    public static void main(String[] args) {
       String act = "geeksforgeeks"; 
       act = sort(act);
       print(act);
     
    }

    public static String sort(String act){
        char ar[]= act.toCharArray();
        int count[]= new int[26];

        for(int i=0; i<act.length(); i++){
            count[act.charAt(i)-'a']++;
        }
       
        int index =0;

        for(int i=0; i<26; i++){
            for(int j=0; j<count[i]; j++){
                ar[index++]= (char) (i+97);
            }
        }
        

        return String.valueOf(ar);
    }


    public static void print(String act){
        for(int i=0; i<act.length(); i++){
            System.out.print(act.charAt(i)+" ");
        }
    }
}
