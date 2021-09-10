package DSA.Doubly_Linked_List_Problem;

public class Reverse_a_doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.PrintList();

        reverse(list);
        list.PrintList();
        
    }

    public static void reverse(DoublyLinkedList list){
        Node curr = list.head;
        Node prev = null;

        if(curr == null || curr.next == null){
            return;
        }

        while (curr != null) {
           prev = curr.prev;
           curr.prev = curr.next;
           curr.next = prev;
           curr = curr.prev;
        }

        list.head = prev.prev;
    }

    //DoublyLinkedList
    public static class DoublyLinkedList{
        Node head,point;

        DoublyLinkedList(){
            head =point = null;
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

        public void PrintList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Doubly Linked List is Empty");
                return;
            }

            while (curr != null) {
                System.out.print(curr.data +" <-> ");
                curr = curr.next;
            }
            System.out.println("Null");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node prev, next;

        Node(int num){
            data = num;
            next =prev = null;
        }
    }
}
