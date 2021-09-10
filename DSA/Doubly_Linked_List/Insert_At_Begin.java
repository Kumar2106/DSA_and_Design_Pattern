package DSA.Doubly_Linked_List;

/**
 * Insert_At_Begin
 */
public class Insert_At_Begin {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.PrintList();

        insertAtBegin(list, 5);
        list.PrintList();

        insertAtBegin(list, 4);
        list.PrintList();
    }

    public static void insertAtBegin(DoublyLinkedList list, int num){
        Node iNode = new Node(num);

        if (list.head == null) {
            list.head = list.point = iNode;
            return;
        }


        iNode.next = list.head;
        list.head.prev = iNode;
        list.head = iNode;
    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head;
        Node point;

        DoublyLinkedList(){
            head = null;
            point = null;
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

            while (curr != null) {
                System.out.print(curr.data+" -> ");
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
            next = prev = null;
        }
    }
}