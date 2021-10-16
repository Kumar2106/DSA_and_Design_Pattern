package DSA.Arrays_Advance;

public class Strongest_Neighbours {
    public static void main(String[] args) {
      int  arr[] = {1,2,2,3,4,5};
      neighbours(arr);
    }

    public static void neighbours(int arr[])
    {
        int size = arr.length;
        for(int i=1; i<size; i++){
            System.out.print(Math.max(arr[i-1], arr[i])+" ");
        }

    }
}
