package DSA.Heap_basic_Problem;

import java.util.PriorityQueue;

public class Kth_smallest_element {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
       
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            queue.add(arr[i]);
        }
        int k =3;

        int i=0;
        while (i != k-1) {
            queue.poll();
            i++;
        }

        System.out.print(queue.poll());
    }

    public static void minHeapify(int i,int arr[], int r){
        int lt = left(i);
        int rt = right(i);
        
        int smallest = i;
        
        if(lt<r && arr[lt] <arr[i]){
            smallest = lt;
        }
        
        if(rt<r && arr[rt] <arr[i]){
            smallest = rt;
        }
        
        if(smallest != i){
            swap(arr,i,smallest);
            minHeapify(smallest,arr,r);
        }
    }
    
    public static int left(int i){
        return (2*i)+1;
    }
    
    public static int right(int i){
        return (2*1)+2;
    }
    
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
