package DSA.Queue_Basic;
public class Queue_Implementation_Using_Linked_List {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.PrintList();
        queue.dequeue();
        queue.PrintList();
    }

    public static class Queue{
        Node front;
        Node rear;
        int size;

        Queue(){
            front = rear = null;
            size =0;

        }

        public void enqueue(int x){
            Node iNode = new Node(x);

            if(front==null){
                front =rear=iNode;
                size++;
                return;
            }

            rear.next = iNode;
            rear = rear.next;
            size++;
        }

        public void dequeue(){
           if (isEmpty()) {
               System.out.println("Queue is Empty");
               return;
           }
           else if(front.next == null){
                front=rear=null;
                size--;
           }
           else{
            front = front.next;
            size--;
           }
        }

        public int size()
        {
            return size;
        }

        public boolean isEmpty(){
            return(front == null);
        }

        public int getFront(){
            return front.data;
        }

        public int getRear(){
            return rear.data;
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
            this.data = num;
            next = null;
        }
    }
}
