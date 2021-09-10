package DSA.Doubly_Linked_List_Problem;
public class Doubly_Linked_List_Tail_Insert {
    public static void main(String[] args) {
        DoublyLinkedList list  = new DoublyLinkedList();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(10);
        list.PrintList();

        list.head = insertlnTail(list, 89);
        list.PrintList();

        list.head = insertlnTail(list, 99);
        list.PrintList();
    }

    public static Node insertlnTail(DoublyLinkedList list, int num){
        Node curr = list.head;
        Node iNode = new Node(num);
        if (curr == null) {
            list.head = list.point =iNode;
            return list.head; 
        }

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = iNode;
        iNode.prev = curr;
        return list.head;
    }

    //DoublyLinkedList 
    public static class DoublyLinkedList{
        Node head,point;

        DoublyLinkedList(){
            head = point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                return;
            }

            point.next = iNode;
            iNode.prev = point;
            point = point.next;
        }

        public  void PrintList() {
            Node curr = head;

            if(curr == null){
                System.out.println("Doubly Linked List is Empty");
                return;
            }

            while(curr != null){
                System.out.print(curr.data +" <-> ");
                curr = curr.next;
            }

            System.out.println("Null");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node next, prev;

        Node(int num){
            data = num;
            prev = next = null;
        }
    }
}
