package DSA.Dequeu_Basic_Problem;

import java.util.Deque;
import java.util.LinkedList;

public class Rotate_Deque_By_K {
    public static void main(String[] args) {
        int n =6;
        int arr[]={1,2,3,4,5,6};
        Deque deque = deque_init(n, arr);

        right_rotate(deque, 2);
        System.out.println(deque);

        left_rotate(deque, 2);
        System.out.println(deque);

        left_rotate(deque, 2);
        System.out.println(deque);
    }
    public static Deque deque_init(int n, int arr[]){
        Deque deque = new LinkedList<>();
        for(int i=0; i<n; i++){
            deque.add(arr[i]);
        }
        return deque;
    }

    public static void right_rotate(Deque deque, int k){

        for(int i=0; i<k; i++){
            int num = (Integer) deque.removeLast();
            deque.addFirst(num);
        }
    }

    public static void left_rotate(Deque deque, int k){
        for(int i=0; i<k; i++){
            int num = (Integer) deque.removeFirst();
            deque.addLast(num);
        }
    }
}
