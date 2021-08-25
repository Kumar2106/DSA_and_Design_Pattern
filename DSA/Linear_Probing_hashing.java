package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Linear_Probing_hashing {
    public static void main(String[] args) {
        MyHash hash = new MyHash(7);
        hash.insert(1);
        hash.search(8);
        hash.insert(9);
        hash.print();
    }

    public static class MyHash{
        int size = 0;
        int capcity;
        int arr[];

        //constructor for the hash data structure
        MyHash(int cap){
            this.capcity = cap;
            arr = new int[cap];
            Arrays.fill(arr, -1);
           
        }

        //this function will insert elment in the hash table
        public boolean insert(int key){
           if (size == capcity) {
               System.out.println("HashTable is already full");
               return false;
           }

           int i = hash(key);
           while(arr[i] != -1 && arr[i] != -2 && arr[i] != key){
               i = (i+1)%capcity;
           }

           if (arr[i] == key) {
               System.out.println("Key is already present in the hashtable");
               return false;
           }

           arr[i] = key;
           size++;
           return true;
        }

        //function to search for a key in the hash table
        public boolean search(int key){
            int h = hash(key);
            int i = h;
            while (arr[i] != -1) {
                if (arr[i] == key) {
                    System.out.println("Key is found");
                    return true;
                }
                i = (i+1) % size;

                if (i == h) {
                    System.out.println("Sorry the key is not present");
                    return false;
                }
            }
            System.out.println("Sorry the key "+key+" is not present");
            return false;
        }


        //this function can print every elment in the hash table.
        public void print(){
            for(int i=0; i<capcity; i++){
                System.out.print(arr[i]+" ");
            }
        }

        //function to calculate hash 
        public int hash(int x){
            return x%capcity;
        }

        public boolean erase(int key){
            int h = hash(key);
            int i =h;
            while (arr[i] != -1) {
                if (arr[i] == key) {
                    System.out.println("Your key has been found");
                    System.out.println("It is getting erased");
                    arr[i] = -2;
                    size--;
                    return true;
                }

                i = (i+1)%capcity;

                if (i == h) {
                    System.out.println("Your key has not been found");
                    return false;
                }
            }
            return false;
        }
    }
}
