package DSA.Doubly_Linked_List;
public class Circular_Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.add(10);
        list.add(20);
        list.printList();

        insertAtHead(list, 30);
        list.printList();

        insertAtHead(list, 40);
        list.printList();
    }

    public static void insertAtHead(DoublyCircularLinkedList list, int num){
        Node iNode = new Node(num);

        if (list.head == null) {
            list.add(num);
            return;
        }

        Node curr = list.head;
        Node last = list.head.prev;
        iNode.next = curr;
        curr.prev = iNode;
        list.head = iNode;
        iNode.prev = last;
        last.next = iNode;
        
    }

    //public static class DoublyCircularLinkedList
    public static class DoublyCircularLinkedList{
        Node head;
        Node point;

        DoublyCircularLinkedList(){
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

            point.next = iNode;
            iNode.prev = point;
            iNode.next = head;
            head.prev = iNode;
            point = point.next;
        }

        public void printList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Doubly Linked List is Empty");
                return;
            }

            do{
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }while(curr != head);

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
