package DSA;

import java.util.*;


public class Winner_of_the_election {
    public static void main(String[] args) {
        String Votes[] = {"andy","blake","clark"};
        int n = 3;
        winner(Votes, n);
    }

    public static void winner(String Votes[], int n){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if (map.containsKey(Votes[i])) {
                map.put(Votes[i], map.get(Votes[i])+1);
            }else{
                map.put(Votes[i], 1);
            }
        }
        TreeMap<String,Integer> sortedmap = new TreeMap();
        sortedmap.putAll(map);
        
        int max = Integer.MIN_VALUE;
        String name = "";
        for(Map.Entry<String,Integer> e: sortedmap.entrySet()){
            if (e.getValue()>max) {
                max = e.getValue();
                name = e.getKey();
            }
        }
        
        System.out.println(name+" "+max);
    }
}
