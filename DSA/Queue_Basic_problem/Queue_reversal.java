package DSA.Queue_Basic_problem;

import java.util.Stack;

public class Queue_reversal {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(6);
        queue.PrintList();

        queue = reverse(queue);
        queue.PrintList();
    }

    public static Queue reverse(Queue queue){
        Stack<Integer> stack = new Stack<>();
        while (queue.front != null) {
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        return queue;
    }

    public static class Queue{
        Node front;
        Node rear;
        int size;

        Queue(){
            front = rear = null;
            size =0;
        }

        public void enqueue(int num){
            Node iNode = new Node(num);

            if (front == null) {
                front = rear = iNode;
                return;
            }

            rear.next = iNode;
            rear = iNode;

        }

        public int dequeue(){
            if (front == null ) {
                front = null;
                return -1;
            }
            else if( front.next == null){
                int num = front.data;
                front = null;
                return num;
            }
            int num = front.data;
            front = front.next;
            return num;
        }

        public int getRear(){
            return rear.data;
        }

        public int getFront(){
            return front.data;
        }

        public int getSize(){
            return size;
        }

        public void PrintList(){
            Node curr = front;

            while(curr != null){
                System.out.print(curr.data +" ");
                curr = curr.next;
            }
            System.out.println(" ");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node next;

        Node(int num){
            data = num;
            next = null;
        }
    }
}
