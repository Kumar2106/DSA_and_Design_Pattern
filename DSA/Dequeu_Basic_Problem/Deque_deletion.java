package DSA.Dequeu_Basic_Problem;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Deque_deletion {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,4,5,5};
        Deque deque = deque_init(arr, n);
        

        
        eraseInRange(deque, 0, 1);
        System.out.println(deque);
        System.out.println(deque.getFirst());

        System.out.println(isEmpty(deque));

        
    }

    public static Deque deque_init(int arr[], int n){
        Deque deque = new LinkedList<Integer>();
        for(int i=0; i<n; i++){
            deque.add(arr[i]);
        }

        return deque;
    }

    public static void eraseAt(Deque deque, int x){
        Stack<Integer> stack = new Stack<>();
        int index =0;
        while (!deque.isEmpty() && index != x) {
            stack.add((Integer)deque.removeFirst());
            index++;
        }

        if (index == x) {
            deque.removeFirst();
        }else{
            System.out.println("Does not have the specified position element");
            return;
        }

        while (!stack.isEmpty()) {
            deque.addFirst(stack.pop());
        }


    }

    public static void eraseInRange(Deque deque, int start, int end){
        int index = 0;
        Stack<Integer> stack = new Stack<>();

        while (!deque.isEmpty() && index != start ) {
            stack.add((Integer) deque.removeFirst());
            index++;
        }

        while (index>=start && !deque.isEmpty() && index<end) {
            deque.removeFirst();
            index++;
        }
       
        while(!stack.isEmpty()){
            deque.addFirst(stack.pop());
        }
    }

    public static void eraseAll(Deque deque){
        while(!deque.isEmpty()){
            deque.pop();
        }
    }

    public static boolean isEmpty(Deque deque){
        return deque.isEmpty();
    }
}
