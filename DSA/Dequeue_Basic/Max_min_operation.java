package DSA.Dequeue_Basic;

import java.util.Deque;
import java.util.LinkedList;

public class Max_min_operation {
    public static void main(String[] args) {
        Min_Max min_Max = new Min_Max();
        min_Max.insertMin(10);
        min_Max.insertMax(12);
        min_Max.insertMax(14);
        min_Max.insertMin(2);

        System.out.println(min_Max.getMin());
        System.out.println(min_Max.getMax());
        
    }

    public static class Min_Max{
        Deque deque;

        Min_Max(){
            deque = new LinkedList<>();
        }

        public void insertMin(int x){
            deque.addFirst(x);
        }

        public void insertMax(int x){
            deque.addLast(x);
        }

        public int getMin(){
            return (Integer) deque.peekFirst();
        }

        public int getMax(){
            return (Integer) deque.peekLast();
        }

        public void extractMin(){
            deque.removeFirst();
        }

        public void extractmax(){
            deque.removeLast();
        }
    }
}
