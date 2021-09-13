package DSA.Dequeue;
public class Linked_List_implementation_of_Dequeue {
    public static void main(String[] args) {
        Dequeue dequeue = new Dequeue();
        dequeue.insertFront(10);
        dequeue.print();
        dequeue.insertFront(20);
        dequeue.print();
        dequeue.insertRear(30);
        dequeue.print();
        dequeue.insertRear(40);
        dequeue.print();
        dequeue.insertFront(50);
        dequeue.print();
        dequeue.deleteFront();
        dequeue.print();
        dequeue.deleteRear();
        dequeue.print();
    }

    public static class Dequeue{
        Node front;
        Node rear;
        int size;

        Dequeue(){
            front =rear = null;
            size =0;
        }

        public void insertFront(int num){
            Node iNode = new Node(num);

            if (front == null) {
                front = rear = iNode;
                size++;
                return;
            }

            front.prev = iNode;
            iNode.next = front;
            front = iNode;
            size++;
        }

        public void deleteFront(){
            if (front == null || front.next == null) {
                front = rear = null;
                size =0;
                return;
            }
            front = front.next;
            size--;
        }

        public void insertRear(int num){
            Node iNode = new Node(num);
            if (front == null) {
                front = rear = iNode;
                size++;
                return;
            }

            rear.next = iNode;
            iNode.prev = rear;
            rear = iNode;
            size++;
        }

        public void deleteRear(){
            if (rear == null || rear.prev == null) {
                rear = null;
                size =0;
                return;
            }

            rear = rear.prev;
            rear.next = null;
            size--;
        }

        public int size(){
            return size;
        }

        public int getFront(){
            return front.data;
        }

        public int getRear(){
            return rear.data;
        }

        public boolean isEmpty(){
            return (front == null);
        }

        public void print(){
            Node curr = front;

            while (curr != null) {
                System.out.print(curr.data +" ");
                curr = curr.next;
            }
            System.out.println("");
        }

    }

    //Node class
    public static class Node{
        int data;
        Node next,prev;

        Node(int num){
            this.data = num;
            next=prev = null;
        }
    }
}
