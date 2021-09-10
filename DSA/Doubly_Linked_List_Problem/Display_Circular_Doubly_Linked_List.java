package DSA.Doubly_Linked_List_Problem;

public class Display_Circular_Doubly_Linked_List {
    public static void main(String[] args) {
         DoublyLinkedList list = new DoublyLinkedList();
         list.add(2);
         list.add(5);
         list.add(7);
         list.add(8);
         list.add(99);
         list.add(100);
         list.PrintList();

         PrintList(list);
    }

    public static void PrintList(DoublyLinkedList list){
        Node tail = list.head.prev;
        Node curr = list.head;

        if (curr == null) {
            System.out.println("Doubly Linked List is Empty");
            return;
        }

        do{
            System.out.print(curr.data +" <-> ");
            curr = curr.next;
        }while(curr != list.head);
        System.out.println("Null");

        do{
            System.out.print(tail.data +" <-> ");
            tail =tail.prev;
        }while(tail != list.head.prev);
        System.out.println("Null");

    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head;
        Node point;

        DoublyLinkedList(){
            head = point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                head.prev = head;
                head.next = head;
                return;
            }

            Node next = point.next;
            point.next = iNode;
            iNode.prev = point;
            iNode.next =next;
            next.prev = iNode;
            point = point.next;
        }

        public void PrintList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Doubly Linked List is Empty");
                return;
            }

            do{
                System.out.print(curr.data +" <-> ");
                curr = curr.next;
            }while(curr != head);

            System.out.println("Null");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node prev,next;

        Node(int num){
            data = num;
            next=prev =null;
        }
    }
}
