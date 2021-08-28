package DSA.Circular_Linked_List_Basic_Problem;
public class Circular_Linked_List_head_insert {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.PrintList();

        insertAtHead(list, 10);
        list.PrintList();

        insertAtHead(list, 20);
        list.PrintList();

    }

    public static void insertAtHead(CircularLinkedList list, int num){
        Node iNode = new Node(num);

        Node next = list.head.next;
        list.head.next = iNode;
        iNode.next = next;

        int temp = list.head.data;
        list.head.data = list.head.next.data;
        list.head.next.data = temp;
    }

    //CircularLinkedList class
    public static class CircularLinkedList{
        Node head;
        Node point;

        CircularLinkedList(){
            this.head = null;
            this.point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                head.next = head;
                return;
            }

            Node next = point.next;
            point.next = iNode;
            iNode.next = next;
            point = point.next;
        }

        public void PrintList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Circular Linked List empty");
                return;
            }

            do{
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }while(curr != head);

            System.out.println("Head");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
