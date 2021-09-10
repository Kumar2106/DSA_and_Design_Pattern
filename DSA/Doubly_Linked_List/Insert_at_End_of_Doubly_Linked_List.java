package DSA.Doubly_Linked_List;
public class Insert_at_End_of_Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.PrintList();

        insertAtLast(list, 31);
        list.PrintList();

        insertAtLast(list, 32);
        list.PrintList();

        list.add(33);
        list.PrintList();
    }

    public static void insertAtLast(DoublyLinkedList list, int num){
        Node iNode = new Node(num);

        if (list.head == null) {
            list.head = list.point = iNode;
            return;
        }

        Node curr = list.head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = iNode;
        iNode.prev = curr;
        list.point = iNode;
    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head;
        Node point;

        DoublyLinkedList(){
            head=point=null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head =point=iNode;
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
            next = null;
            prev = null;
        }
    }
}
