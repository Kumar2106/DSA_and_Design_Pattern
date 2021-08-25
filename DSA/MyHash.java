package DSA;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {
    public static void main(String[] args) {
        Hash hash = new Hash(7);
        hash.insert(2);
        hash.search(3);
        hash.delete(1);
    }

    public static class Hash{
        int bucket;
        ArrayList<LinkedList<Integer>> list;

        public Hash(int b){
            this.bucket = b;
            list = new ArrayList<LinkedList<Integer>>();
            for (int i = 0; i <b; i++) {
                list.add(new LinkedList<Integer>());
            }
            System.out.println("The size of the hash data structure is "+list.size());
        }

        public void insert(int x){
            int index = x%bucket;
            LinkedList num = list.get(index);
           num.add(x);
           System.out.println("the number has been inserted");
        }

        public void delete(int x){
            int index = x%bucket;
            LinkedList num = list.get(index);
             
            //if there is no numb 
            if (num == null) {
                System.out.println("sorry there are no any number inserted here");
                return;
            }
            if (num.contains(x)) {
                num.remove((Integer) x);
                System.out.println("The number is deleted ");
            }else{
                System.out.println("The number you are tryig to delete is not inserted");
            }
        }

        public void search(int x){
            int index = x%bucket;
            LinkedList num = list.get(index);

            if (num.contains(x)) {
                System.out.println("Yes the number exist");
            }else{
                System.out.println("No the number does not exist");
            }
        }
    }
}
