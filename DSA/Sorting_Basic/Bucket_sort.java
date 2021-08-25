package DSA.Sorting_Basic;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class Bucket_sort {
    public static void main(String[] args) {
        int arr[]={30,40,10,80,5,12,70};
        int k=4;
        sort(arr, arr.length, k);
        print(arr, arr.length);
    }

    //n is the size of the array
    //k is the no of buckets
    public static void sort(int arr[], int n, int k){
        int max=arr[0];
        for(int i=1; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        max++;

        ArrayList<ArrayList<Integer>> bkt = new ArrayList<>();

        for(int i=0; i<k; i++){
            bkt.add(new ArrayList<>());
        }

        for(int i=0; i<n; i++){
            int bi = (k*arr[i])/max;
            bkt.get(bi).add(arr[i]);
        }

        for(int i=0; i<k; i++){
            Collections.sort(bkt.get(i));
        }

        int index =0;

        for(int i=0; i<k; i++){
            for(int j=0; j<bkt.get(i).size(); j++){
                arr[index++]=bkt.get(i).get(j);
            }
        }

    }

    //utility function to print the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
