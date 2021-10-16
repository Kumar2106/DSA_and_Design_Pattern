package DSA.Recursion_Advance;

import java.util.ArrayList;

public class Lucky_Number {
    public static void main(String[] args) {
        System.out.println(isluckyNumber(74));
    }

    static boolean isluckyNumber(int n){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            result.add(i);
        }

       int counter = 1;

        while (counter<=result.size()) {
            for(int i=counter; i<result.size(); i+=2){
                result.remove(i);
            }

            counter++;
            System.out.println(counter);
        }

        System.out.println(result+" "+ counter);

        if (result.contains(n)) {
            return true;
        }
        return false;
    }
}
