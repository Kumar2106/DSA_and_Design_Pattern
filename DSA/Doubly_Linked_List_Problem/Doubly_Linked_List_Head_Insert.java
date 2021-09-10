package DSA.Doubly_Linked_List_Problem;

public class Doubly_Linked_List_Head_Insert {
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

        list.head = insertlnHead(list.head, 89);

        list.PrintList();
    }

    public static Node insertlnHead(Node head, int num){
        Node iNode = new Node(num);
        iNode.next = head;
        head.prev = iNode;
        return iNode;
    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head;
        Node point;

        DoublyLinkedList(){
            head=point= null;
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

        public void PrintList() {
            Node curr = head;

            if(curr == null){
                System.out.println("Doubly Linked List Empty");
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
            next = prev = null;
        }
    }
}
