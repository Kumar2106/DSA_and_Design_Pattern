package DSA.Dequeue_Basic;

public class Dequue_implementation_using_Circular_Array {
    public static void main(String[] args) {
        Deque deque = new Deque(10);
        deque.insertFront(10);
        deque.print();
    }

    public static class Deque{
        int arr[];
        int front, cap, size;

        Deque(int c){
            arr = new int[c];
            cap = c;
            front = size =0;
        }

        public void deleteFront(){
            if (isEmpty()) {
                return;
            }else{
                front = (front+1)%cap;
                size--;
            }
        }

        public void insertRear(int x){
            if (isFull()) {
                return;
            }

            int new_rear = (front+size)%cap;
            arr[new_rear] = x;
            size++;
        }

        public int getFront(){
            if (isEmpty()) {
                return -1;
            }
            else{
                return front;
            }
        }

        public void insertFront(int x){
            if (isFull()) {
                return;
            }
            front = (front+cap -1)%cap;
            arr[front]=x;
            size++;
        }

        public void deleteRear(){
            if (isEmpty()) {
                return;
            }
            size--;
        }

        public int getRear(){
            if (isEmpty()) {
                return -1;
            }

            else{
                return (front+size -1)%cap;
            }
        }

        public void print(){
            for(int i=0; i<cap; i++){
                if (arr[i]!=0) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println("");
            }
        }

        public boolean isFull(){
            return (size == cap);
        }

        public boolean isEmpty(){
            return (size ==0);
        }
    }
}
