package DSA.Sorting_Basic;

import java.util.Arrays;

public class Mergin_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int a[]={10,15,20,20};
        int b[]={1,12};
        int s1 = a.length;
        int s2 = b.length;

        optimisedSolution(a, b, s1, s2);
    }

    public static void merging(int a[], int b[], int s1, int s2){
        int c[]= new int[s1+s2];
        int i;
        for(i=0;i<s1; i++){
            c[i] = a[i];
        }

        for(int j=0; j<s2; j++){
            c[i+j]= b[j];
        }

        Arrays.sort(c);
        print(c, c.length);

    }
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //optimised solution for sorting two arrays.
    public static void optimisedSolution(int a[], int b[], int s1, int s2){
        int i=0,j=0;
        int index =0;
        int c[] = new int[s1+s2];

        while(i<s1 && j<s2){
            if(a[i]<=b[j]){
                c[index++]=a[i++];
            }else{
                c[index++] = b[j++];
            }
        }

        while(i<s1){
            c[index++] = a[i++];
        }

        while(j<s2){
            c[index++]= b[j++];
        }

        print(c, c.length);
    }
}
