package DSA.Queue_Basic;

public class Queue_implementation_using_Circular_Array {
    public static void main(String[] args) {
        
    }

    private static class Queue{
        int front,cap,size;
        int arr[];

        Queue(int cap){
            arr = new int[cap];
            this.cap = cap;
            front = 0;
            size =0;
        }

        public boolean isFull(){
            return(cap == size);
        }

        public boolean isEmpty(){
            return (size ==0);
        }

        public int getFront(){
            if (isEmpty()) {
                return -1;
            }

            return front;
        }

        public int getRear(){
            if (isEmpty()) {
                return -1;
            }
            // this is important to memorize
            return (front+size -1)%cap;
        }

        public void enqueue(int x){
            if (isFull()) {
                return;
            }

            int rear = getRear();
            rear = (rear+1)%cap;
            arr[rear] =x;
            size++;
        }

        public void dequeue(){
            if (isEmpty()) {
                return;
            }
            front  = (front+1)%cap;
            size--;
        }

    }
}
