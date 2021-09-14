package DSA.Dequeu_Basic_Problem;

import java.util.Deque;
import java.util.LinkedList;

public class Insert_in_Dequeu {
    public static void main(String[] args) {
        int n =5;
        int arr[]={1,2,3,4,5};
        Deque deque = deque_init(arr, n);
        print_deque(deque);
    }

    public static Deque deque_init(int arr[], int n){
        Deque deque = new LinkedList<Integer>();

        for(int i=0; i<n; i++){
            deque.add(arr[i]);
        }
        return deque;
    }

    public static void print_deque(Deque deque){
        while(!deque.isEmpty()){
            System.out.print(deque.pop()+" ");
        }
        System.out.println("");
    }
}
