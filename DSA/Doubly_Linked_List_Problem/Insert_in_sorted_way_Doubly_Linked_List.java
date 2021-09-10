package DSA.Doubly_Linked_List_Problem;

public class Insert_in_sorted_way_Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(12);
        list.PrintList();

        sortedInsertion(list, 4);
        list.PrintList();

        sortedInsertion(list, 2);
        list.PrintList();

        sortedInsertion(list, 15);
        list.PrintList();
    }

    public static void sortedInsertion(DoublyLinkedList list, int num){
        Node iNode = new Node(num);

        if (list.head == null) {
            list.head = list.point =iNode;
            return;
        }

        if (list.head.data > num) {
            iNode.next = list.head;
            list.head.prev = iNode;
            list.head = iNode;
            return;
        }

        Node curr = list.head;

        while (curr.next != null && curr.next.data <num) {
            curr = curr.next;
        }

        if (curr.next == null) {
            curr.next =iNode;
            iNode.prev = curr;
            list.point = iNode;
            return;
        }

        Node next = curr.next;
        curr.next =iNode;
        iNode.prev = curr;
        iNode.next =next;
        next.prev = iNode;
    }

    //DoublyLinkedList class
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
            prev = next = null;
        }
    }
}
