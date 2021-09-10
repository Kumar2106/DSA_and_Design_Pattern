package DSA.Doubly_Linked_List;

public class Reverse_a_Doubly_Linked_list {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.PrintList();

        reverse(list);
        list.PrintList();
    }

    public static void reverse(DoublyLinkedList list){
        Node curr = list.head;

        if (curr == null || curr.next == null) {
            return;
        }

        Node prev = null;

        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }

        list.head = prev.prev;

    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head;
        Node point;

        DoublyLinkedList(){
            head=point = null;
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
                System.out.println("Doubly Linked List is Null");
                return;
            }
            while(curr != null){
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }


            System.out.println("Null");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int num){
            data = num;
            prev = next = null;
        }
    }
}
