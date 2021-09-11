package DSA.Queue_Basic;

public class Implementating_Queue_Using_Array {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();
    }

    private static class Queue{
        int front,rear,size,capacity;
        int arr[];

        Queue(int cap){
            front=rear = -1;
            arr=new int[cap];
            size =0;
            capacity = cap;
        }

        public void enqueue(int x){
            if (front== -1) {
                arr[++front] =x;
                size++;
                rear++;
                return;
            }

            arr[++rear] =x;
            size++;

        }

        public int dequeue(){
            size--;
            return arr[front++];
        }

        public boolean isFull(){
            return (size==capacity);
        }

        public boolean isEmpty(){
            return (front == -1|| front>rear);
        }

        public int getFront(){
            if (!isEmpty()) {
                return arr[front];
            }

            System.out.println("Queue is Empty");
            return -1;
        }

        public int getRear(){
            if (!isEmpty()) {
                return arr[rear];
            }

            System.out.println("Queue is Empty");
            return -1;
        }

        public int size(){
            return size;
        }

        public void printQueue(){
            System.out.println("Inside Print Queue");
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println("");
        }
    }

}
